package org.fabian.dto.input;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Payload {
    private Integer brandId;
    private Long productId;
    private LocalDateTime requestTime;
}
