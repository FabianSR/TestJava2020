package org.fabian.application.adapters.persistence.mapper;

import org.fabian.application.adapters.persistence.entities.Fare;
import org.fabian.application.dto.FareDto;
import org.springframework.stereotype.Component;

@Component
public class FareEntityToFareDtoMapper {
    public Fare mapToFareEntity(FareDto fareDto){
        return new Fare();
    }
    public FareDto mapToFareDto(Fare carDocument){
        return new FareDto();
    }
}
