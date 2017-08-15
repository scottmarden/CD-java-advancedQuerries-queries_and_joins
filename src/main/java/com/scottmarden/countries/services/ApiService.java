package com.scottmarden.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scottmarden.countries.models.City;
import com.scottmarden.countries.models.Country;
import com.scottmarden.countries.models.Language;
import com.scottmarden.countries.repositories.CityRepository;
import com.scottmarden.countries.repositories.CountryRepository;
import com.scottmarden.countries.repositories.LanguageRepository;

@Service
public class ApiService {

	private CountryRepository countryRepository;
	private LanguageRepository languageRepository;
	private CityRepository cityRepository;
	
	public ApiService(CountryRepository countryRepository, LanguageRepository languageRepository, CityRepository cityRepository) {
		this.countryRepository = countryRepository;
		this.languageRepository = languageRepository;
		this.cityRepository = cityRepository;
	}
	
	public List<Country> findAllCountries() {
		List<Country> countries = countryRepository.findAllCountries();	
		return countries;
	}
	
	public List<Object[]> joinCountriesAndLanguages(){
		return countryRepository.joinCountriesAndLanguages();
	}
	
	public List<Object[]> findCountryByLanguage(String language){
		return countryRepository.findCountryWithLanguage(language);
	}
	
	public List<Object[]> findCountriesWithNumCities(){
		return countryRepository.findCountriesWithNumCities();
	}
	
	public List<City> findCitiesInCountryWithPopulation(String country, Long population){
		return cityRepository.findCitiesInCountryWithPopulation(country, population);
	}
	
	public List<Object[]> findLanguagesInAllCountriesOverPercentage(Float percentage){
		return countryRepository.findLanguagesInAllCountriesOverPercentage(percentage);
	}
	
	public List<Country> findCountriesLessThanSizeGreaterThanPopulation(Float size, Long population){
		return countryRepository.findCountriesLessThanSizeGreaterThanPopulation(size, population);
	}
	
	public List<Country> findCountriesWithGovtCapitalLifeExpentancy(String govt, Long capital, Float lifeExp){
		return countryRepository.findCountriesWithGovtCapitalLifeExpectancy(govt, capital, lifeExp);
	}
	
	public List<Object[]> findCitiesInCountryInDistrictWithPopulation(String country, String city, Long population){
		return cityRepository.findCitiesInCountryInDistrictWithPopulation(country, city, population);
	}
	
	public List<Object[]> findNumberOfCountriesInRegions(){
		return countryRepository.findNumberOfCountriesInRegions();
	}
	
	public List<Language> findAllLanguagesNames(){
		return languageRepository.findAllLanguagesNames();
	}
	
}
