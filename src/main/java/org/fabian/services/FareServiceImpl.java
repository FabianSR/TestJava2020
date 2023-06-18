package org.fabian.services;

import org.fabian.domain.model.Fare;
import org.fabian.persistence.FareDao;
import org.fabian.persistence.mapper.FareDomainToFareEntityMapper;
import org.springframework.stereotype.Service;

import static java.util.Comparator.comparing;

@Service
public class FareServiceImpl implements FareService {

    private final FareDao fareDao;
    private final FareDomainToFareEntityMapper mapper;

    public FareServiceImpl(final FareDao fareDao, final FareDomainToFareEntityMapper mapper) {
        this.fareDao = fareDao;
        this.mapper = mapper;
    }

    @Override
    public Fare getFare(final Fare fare) {
        return fareDao.findAllByBrandBrandIdAndProductProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(fare.getBrand().getBrandId(),
                fare.getProduct().getProductId(), fare.getStartDate(), fare.getEndDate())
                .stream().max(comparing(org.fabian.persistence.entities.Fare::getPriority))
                .map(mapper::mapToFareDomain).orElseThrow(IllegalArgumentException::new);
    }
}
