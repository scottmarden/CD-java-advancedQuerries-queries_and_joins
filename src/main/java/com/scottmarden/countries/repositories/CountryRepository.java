package com.scottmarden.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scottmarden.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	
	List<Country> findAll();
	
	@Query("SELECT c FROM Country c")
	List<Country> findAllCountries();
//	
//	@Query("SELECT c FROM Country c WHERE id = ?1")
//	List<Country> getCountryWhereId(Long id);
//	
//	@Query("SELECT c FROM Country c WHERE id = ?1")
//	Country getSingleCountryWhereId(Long id);
	
	@Query("SELECT c, l FROM Country c JOIN c.languages l")
	List<Object[]> joinCountriesAndLanguages();
	
	@Query("SELECT c.name FROM Country c JOIN c.languages l WHERE language = ?1 ORDER BY percentage DESC")
	List<Object[]> findCountryWithLanguage(String language);
	
	@Query("SELECT c.name, COUNT(ci) FROM Country c JOIN c.cities ci GROUP BY c ORDER BY COUNT(ci) DESC")
	List<Object[]> findCountriesWithNumCities();
	
	@Query("SELECT c.name, l.language FROM Country c JOIN c.languages l WHERE l.percentage >= ?1 ORDER BY c.name, l.percentage")
	List<Object[]> findLanguagesInAllCountriesOverPercentage(Float percentage);
	
	@Query("SELECT c FROM Country c WHERE c.surface_area < ?1 AND c.population >= ?2")
	List<Country> findCountriesLessThanSizeGreaterThanPopulation(Float size, Long population);
	
	@Query("SELECT c FROM Country c WHERE c.government_form = ?1 AND c.capital > ?2 AND c.life_expectancy < ?3")
	List<Country> findCountriesWithGovtCapitalLifeExpectancy(String govt, Long capital, Float lifeExp);
	
	@Query("SELECT c.region, COUNT(c) FROM Country c GROUP BY region ORDER BY COUNT(c) DESC")
	List<Object[]> findNumberOfCountriesInRegions();
	
}
