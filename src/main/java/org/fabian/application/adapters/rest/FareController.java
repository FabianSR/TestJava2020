package org.fabian.application.adapters.rest;

import org.springframework.web.bind.annotation.*;
import org.fabian.application.dto.FareDto;
import org.fabian.application.services.FareService;

@RestController
@RequestMapping("/fare")
public class FareController {

    private final FareService fareService;

    FareController(final FareService fareService) {
        this.fareService = fareService;
    }

    @PostMapping("/")
    FareDto getFare(final @RequestBody FareDto fareDto) {
        return fareService.invoke(fareDto);
    }
}
