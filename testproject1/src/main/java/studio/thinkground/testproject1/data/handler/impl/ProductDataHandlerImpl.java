package studio.thinkground.testproject1.data.handler.impl;


import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.testproject1.data.dao.ProductDAO;
import studio.thinkground.testproject1.data.entity.ProductEntity;
import studio.thinkground.testproject1.data.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;
    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice,
                                           int productStock) {
        ProductEntity productEntity = new ProductEntity(productId, productName, productPrice,
                productStock);

        return productDAO.saveProduct(productEntity);
    }
    @Override
    public ProductEntity getProductEntity(String productId) {

        return productDAO.getProduct(productId);
    }
}