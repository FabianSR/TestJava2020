package org.fabian.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class FareDto {
    private String priceList;
    private ProductDto product;
    private BrandDto brand;
    private String curr;
    private LocalDateTime startDate, endTime;
    private Integer priority;
    private BigDecimal price;
}
