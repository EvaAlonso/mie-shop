package com.discacoder.mieShop.service.image;

import com.discacoder.mieShop.dto.ImageDto;
import com.discacoder.mieShop.model.Image;
import com.discacoder.mieShop.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
