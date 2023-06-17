package org.fabian.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.fabian.application.dto.FareDto;
import org.fabian.domain.model.Fare;


@Mapper
public interface FareDtoToFareMapper {
    FareDtoToFareMapper mapperInstance = Mappers.getMapper(FareDtoToFareMapper.class);
    FareDto mapToFareDto(Fare fare);
	Fare mapToFareDomain(FareDto fareDto);
}
