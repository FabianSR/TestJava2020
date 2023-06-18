package org.fabian.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Fare {
    private Integer priceList;
    private Product product;
    private Brand brand;
    private String curr;
    private LocalDateTime startDate, endDate;
    private Integer priority;
    private BigDecimal price;
}
