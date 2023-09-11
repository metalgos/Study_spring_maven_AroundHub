package studio.thinkground.testproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.testproject1.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
