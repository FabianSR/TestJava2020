package org.fabian.controller;

import org.fabian.controller.mapper.FareDtoToFareDomainMapper;
import org.fabian.dto.input.Payload;
import org.fabian.dto.output.FareDto;
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

    public FareController(final FareService fareService, final FareDtoToFareDomainMapper mapper) {
        this.fareService = fareService;
        this.mapper = mapper;
    }

    @PostMapping("/")
    public FareDto getFare(final @RequestBody Payload payload) {
        return mapper.mapToFareDto(fareService.getFare(mapper.mapToFareDomain(payload)));
    }
}
