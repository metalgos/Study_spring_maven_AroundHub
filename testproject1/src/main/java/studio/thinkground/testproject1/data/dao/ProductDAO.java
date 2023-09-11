package studio.thinkground.testproject1.data.dao;

import studio.thinkground.testproject1.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
