package com.discacoder.mieShop.service.image;

import com.discacoder.mieShop.model.Image;
import com.discacoder.mieShop.model.Product;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
