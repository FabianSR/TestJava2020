package org.fabian.application.services;

import org.fabian.application.adapters.persistence.FareDao;
import org.fabian.application.adapters.persistence.mapper.FareEntityToFareDtoMapper;
import org.fabian.application.dto.FareDto;
import org.springframework.stereotype.Service;

@Service
public class FareServiceImpl implements FareService {

    private final FareDao fareDao;
    private final FareEntityToFareDtoMapper mapper;

    public FareServiceImpl(final FareDao fareDao, final FareEntityToFareDtoMapper mapper) {
        this.fareDao = fareDao;
        this.mapper = mapper;
    }

    @Override
    public FareDto invoke(final FareDto fareDto) {
        return fareDao.findById(fareDto.getPriceList()).map(mapper::mapToFareDto).orElseThrow(() -> new RuntimeException());
    }
}
