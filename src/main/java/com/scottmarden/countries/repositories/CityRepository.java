package com.scottmarden.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scottmarden.countries.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

	@Query("SELECT ci FROM City ci JOIN ci.country c WHERE c.name = ?1 AND ci.population >= ?2 ORDER BY ci.population DESC")
	List<City> findCitiesInCountryWithPopulation(String country, Long population);
	
	@Query("SELECT  c.name, ci.name, ci.district, ci.population FROM City ci JOIN ci.country c WHERE c.name = ?1 AND ci.district = ?2 AND ci.population > ?3 ")
	List<Object[]> findCitiesInCountryInDistrictWithPopulation(String country, String city, Long population);
	
}
