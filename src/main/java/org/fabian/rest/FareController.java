package org.fabian.rest;

import org.fabian.rest.mapper.FareDtoToFareDomainMapper;
import org.fabian.dto.FareDto;
import org.fabian.services.FareService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class FareController {

    private final FareService fareService;
    private final FareDtoToFareDomainMapper mapper;

    FareController(final FareService fareService, final FareDtoToFareDomainMapper mapper) {
        this.fareService = fareService;
        this.mapper = mapper;
    }

    @PostMapping("/")
    FareDto getFare(final @RequestBody FareDto fareDto) {
        return mapper.mapToFareDto(fareService.invoke(mapper.mapToFareDomain(fareDto)));
    }
}
