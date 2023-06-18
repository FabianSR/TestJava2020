package org.fabian.controller.mapper;

import org.fabian.domain.model.Fare;
import org.fabian.dto.input.Payload;
import org.fabian.dto.output.FareDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FareDtoToFareDomainMapper {
    FareDto mapToFareDto(Fare fare);
    @Mapping(source = "requestTime", target = "startDate")
    @Mapping(source = "requestTime", target = "endDate")
    @Mapping(source = "productId", target = "product.productId")
    @Mapping(source = "brandId", target = "brand.brandId")
    Fare mapToFareDomain(Payload fareDto);
}
