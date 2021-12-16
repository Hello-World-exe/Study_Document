package com.reviewpot.api.storage.service;

import com.google.common.net.HttpHeaders;
import com.reviewpot.api.storage.dto.FileSummary;
import com.reviewpot.api.storage.exceptions.StorageException;
import com.reviewpot.api.storage.exceptions.StorageFileNotFoundException;
import com.reviewpot.api.storage.properties.StorageProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.file.*;

@Profile({"file"})
@RequiredArgsConstructor
@Service("storageFileService")
public class StorageFileService implements StorageService {

    private final Path rootLocation;
    private final StorageProperties storageProperties;

    @Autowired
    public StorageFileService(StorageProperties properties) {
        this.rootLocation = Paths.get(properties.getLocation());
        this.storageProperties = properties;
    }

    @Override
    public void store(MultipartFile file, Path path, boolean isSecret) throws Exception {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        if (file.isEmpty()) {
            throw new StorageException("Failed to store empty file " + filename);
        }

        if (filename.contains("..")) {
            throw new StorageException(
                    "Cannot store file with relative path outside current directory " + filename);
        }

        Path target = this.rootLocation.resolve(path);
        if (Files.isDirectory(target)) {
            throw new StorageException("The path is not a file " + target);
        }

        createDirectory(target.getParent());
        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    @Override
    public ResponseEntity getResponseEntity(FileSummary fs, boolean secret) {
        try {

            Path target = this.rootLocation.resolve(fs.getPath());
            if (Files.isDirectory(target)) {
                throw new StorageException("The path is not a file " + target);
            }

            Resource resource = new UrlResource(target.toUri());
            if (resource.exists() || resource.isReadable()) {
                String encordedFilename = URLEncoder.encode(fs.getName(), "UTF-8").replace("+", "%20");
                String cd = String.format(
                        "attachment; filename=\"%s\";filename*=UTF-8''%s",
                        encordedFilename,
                        encordedFilename
                );

                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, cd)
                        .header(HttpHeaders.CONTENT_TYPE, fs.getContentType())
                        .header(HttpHeaders.CONTENT_LENGTH, String.valueOf(fs.getSize()))
                        .body(resource);
            } else {
                throw new StorageFileNotFoundException(
                        "Could not read file: " + target.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).build();
        }
    }

    @Override
    public ResponseEntity getResponseEntity(FileSummary fs, Long w, Long h, String t) {

        Path target = this.rootLocation.resolve(fs.getPath());
        if (Files.isDirectory(target)) {
            throw new StorageException("The path is not a file " + target);
        }

        try {
            String convertedFileName = w + "x" + h + "_" + t + ".jpg";

            Path convertedPath = target.getParent().resolve(convertedFileName);
            if (!convertedPath.toFile().exists()) {


                // FIX ME
                convertedPath = target;

            }

            Resource resource = new UrlResource(convertedPath.toUri());
            if (resource.exists() || resource.isReadable()) {
                String encordedFilename = URLEncoder.encode(convertedFileName, "UTF-8").replace("+", "%20");
                String cd = String.format(
                        "inline; filename=\"%s\";filename*=UTF-8''%s",
                        encordedFilename,
                        encordedFilename
                );

                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, cd)
                        .header(HttpHeaders.CONTENT_TYPE, fs.getContentType())
                        .body(resource);
            } else {
                throw new StorageFileNotFoundException(
                        "Could not read file: " + target.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).build();
        }

//    Path originPath = Paths.get(attachFile.getServerFilePath());
//    Path convertedPath = originPath.getParent().resolve(convertedFileName);
//
//    Path absoluteOriginPath = storageService.load(originPath.toString());
//    Path absoluteConvertedPath = absoluteOriginPath.getParent().resolve(convertedFileName);
//
//    try {
//      try {
//        Resource resource = storageService.loadAsResource(convertedPath.toString());
//        if (resource.exists() && resource.isFile()) {
//          return FileDto.Download.builder()
//              .attachFile(modelMapper.map(attachFile, FileDto.Response.class))
//              .resource(resource)
//              .build();
//        }
//      } catch (StorageFileNotFoundException e) {
//        // nothing
//        log.error(e.getMessage());
//      }
//
//      if (!type.equals("crop")) {
//        BufferedImage bufferedImage = ImageIO.read(originPath.toFile());
//        float w = (float) bufferedImage.getWidth() / (float) width;
//        float h = (float) bufferedImage.getHeight() / (float) height;
//        if (h > w) {
//          width = 0L;
//        } else {
//          height = 0L;
//        }
//      }
//
//      Map<String, String> args = new LinkedHashMap<>();
//      args.put("-resize", width + "x" + height + "^");
//      args.put("-quality", "90");
//      args.put("-gravity", "center");
//      args.put("-auto-orient", "");
//      args.put("-crop", width + "x" + height + "+0+0");
//      args.put("+repage", "");
//
//      String commandArgs = mapToCommand(args);
//      List<String> commandList = Lists.newLinkedList();
//      if (System.getProperty("os.name").contains("windows")) {
//        commandList.add("\"" + fileProperties.getExtensionConvert() + "\"");
//        commandList.add(
//            absoluteOriginPath.toString() + ((attachFile.isGif() || attachFile.isVideo())
//                ? "[0]"
//                : ""));
//        commandList.add(commandArgs);
//        commandList.add(absoluteConvertedPath.toString());
//      } else {
//        commandList.add(fileProperties.getExtensionConvert());
//        commandList.add(absoluteOriginPath.toString() + (
//            (attachFile.isGif() || attachFile.isVideo()) ? "[0]" : ""));
//        commandList.add(commandArgs);
//        commandList.add(absoluteConvertedPath.toString());
//      }
//
//      String command = String.join(" ", commandList);
//      log.info("command: {}", command);
//
//      try {
//        Process process = Runtime.getRuntime().exec(command);
//        process.waitFor();
//      } catch (Exception e) {
//        // nothing
//        log.error("Error occurrence", e);
//      }
//
//      return FileDto.Download.builder()
//          .attachFile(modelMapper.map(attachFile, FileDto.Response.class))
//          .resource(storageService.loadAsResource(convertedPath.toString()))
//          .build();
//    } catch (IOException e) {
//      throw new RuntimeException("Failed to load file " + convertedPath, e);
//    }

    }

    private void createDirectory(Path path) throws IOException {
        try {
            Files.createDirectories(path);
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
