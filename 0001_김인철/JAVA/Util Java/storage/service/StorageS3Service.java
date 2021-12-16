package com.reviewpot.api.storage.service;

import com.reviewpot.api.storage.dto.FileSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

@Profile({"s3"})
@RequiredArgsConstructor
@Service("storageS3Service")
public class StorageS3Service implements StorageService {

    @Override
    public void store(MultipartFile file, Path path, boolean isSecret) throws Exception {

    }

    @Override
    public ResponseEntity getResponseEntity(FileSummary fs, boolean secret) {
        return null;
    }

    @Override
    public ResponseEntity getResponseEntity(FileSummary fs, Long w, Long h, String t) {
        return null;
    }
}

