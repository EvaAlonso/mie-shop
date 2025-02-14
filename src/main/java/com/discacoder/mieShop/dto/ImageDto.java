package com.discacoder.mieShop.dto;

import lombok.Data;

@Data
public class ImageDto {
    private Long imageId;
    private String imageName;
    private String downloadUrl;

    public void setFileName(String fileName) {

    }

    public void setId(Long id) {
    }
}
