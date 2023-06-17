package org.fabian.application.adapters.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fare")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fare {
    @Id
    @JoinColumn(name = "price_list")
    private String priceList;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brandId;
    private String curr;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priority;
    private BigDecimal price;
}
