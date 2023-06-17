package org.fabian.application.adapters.persistence;


import org.fabian.application.adapters.persistence.entities.Fare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FareDao extends JpaRepository<Fare, String> {
}
