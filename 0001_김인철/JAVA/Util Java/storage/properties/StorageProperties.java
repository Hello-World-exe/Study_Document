package com.reviewpot.api.storage.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties("storage")
public class StorageProperties {

    private String location;

}
