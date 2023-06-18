package org.fabian.rest.mapper;

import org.fabian.domain.model.Fare;
import org.fabian.dto.FareDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FareDtoToFareDomainMapper {
    //FareDtoToFareMapper mapperInstance = Mappers.getMapper(FareDtoToFareMapper.class);
    FareDto mapToFareDto(Fare fare);
    Fare mapToFareDomain(FareDto fareDto);
}
