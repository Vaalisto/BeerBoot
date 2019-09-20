package fi.vaalisto.BeerBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fi.vaalisto.BeerBoot.models.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {

}