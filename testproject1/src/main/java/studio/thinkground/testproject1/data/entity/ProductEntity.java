package studio.thinkground.testproject1.data.entity;


import lombok.*;
import studio.thinkground.testproject1.data.dto.ProductDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="product")
public class ProductEntity {

    @Id
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

 /*
  @Column
  String sellerId;

  @Column
  String sellerPhoneNumber;
   */


    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }

}
