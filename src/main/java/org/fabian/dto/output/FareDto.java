package org.fabian.dto.output;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class FareDto {
    private Integer priceList;
    private ProductDto product;
    private BrandDto brand;
    private String curr;
    private LocalDateTime startDate, endDate;
    private Integer priority;
    private BigDecimal price;
}
