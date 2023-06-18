package org.fabian.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Fare {
    private String priceList;
    private Product product;
    private Brand brand;
    private String curr;
    private LocalDateTime startDate, endTime;
    private Integer priority;
    private BigDecimal price;
}
