package com.discacoder.mieShop.service.product;

import com.discacoder.mieShop.model.Product;
import com.discacoder.mieShop.request.AddProductRequest;
import com.discacoder.mieShop.request.ProductUpdateRequest;
import org.aspectj.weaver.ast.Literal;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
