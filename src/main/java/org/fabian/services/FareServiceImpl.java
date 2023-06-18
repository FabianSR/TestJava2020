package org.fabian.services;

import org.fabian.persistence.FareDao;
import org.fabian.domain.model.Fare;
import org.fabian.persistence.mapper.FareDomainToFareEntity;
import org.springframework.stereotype.Service;

@Service
public class FareServiceImpl implements FareService {

    private final FareDao fareDao;
    private final FareDomainToFareEntity mapper;

    public FareServiceImpl(final FareDao fareDao, final FareDomainToFareEntity mapper) {
        this.fareDao = fareDao;
        this.mapper = mapper;
    }

    @Override
    public Fare invoke(final Fare fare) {
        return fareDao.findById(fare.getPriceList()).map(mapper::mapToFareDomain).orElseThrow(() -> new RuntimeException());
    }
}
