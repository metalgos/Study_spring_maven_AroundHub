package studio.thinkground.testproject1.service;

import studio.thinkground.testproject1.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);

}