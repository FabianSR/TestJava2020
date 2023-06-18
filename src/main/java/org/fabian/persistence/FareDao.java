package org.fabian.persistence;


import org.fabian.persistence.entities.Fare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface FareDao extends JpaRepository<Fare, String> {
    List<Fare> findAllByBrandBrandIdAndProductProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Integer brandId, Long productId, LocalDateTime startDate, LocalDateTime endDate);
}
