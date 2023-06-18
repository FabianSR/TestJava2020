package org.fabian.persistence.mapper;

import org.fabian.persistence.entities.Fare;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FareDomainToFareEntityMapper {
    org.fabian.domain.model.Fare mapToFareDomain(Fare fareEntity);
}
