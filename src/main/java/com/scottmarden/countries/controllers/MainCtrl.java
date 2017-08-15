package com.scottmarden.countries.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scottmarden.countries.models.City;
import com.scottmarden.countries.services.ApiService;

@Controller
public class MainCtrl {
	
	private final ApiService apiService;
	
	public MainCtrl(ApiService apiService) {
		this.apiService = apiService;
	}

	@RequestMapping("/")
	public String index() {
//		System.out.println(apiService.findAllLanguagesNames());
//		
//		System.out.println(apiService.joinCountriesAndLanguages());
//----------------------------1. Countries with language Slovene, arranged by language percent(desc) --------------------------------------------------------------		
// 		
//		System.out.println(apiService.findCountryByLanguage("slovene"));
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------2. Name of countries and total number of cities ordered by number of cities(desc)----------------------------------------------------

//		List<Object[]> countries = apiService.findCountriesWithNumCities();
//		for(int i = 0; i < countries.size(); i++ ) {
//			Object[] country = countries.get(i);
//			System.out.println("Country: " + country[0] + ". Number of Cities: " + country[1]);
//		}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------3. All the cities in Mexico with a population of greater than 500,000 oredered by Population(desc)----------------------------------------------------
		
//		List<City> cities = apiService.findCitiesInCountryWithPopulation("mexico", 500000L);
//		for(City city : cities) {
//			System.out.println("City: " + city.getName() + " Population: " + city.getPopulation());
//		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------4. Get all languages in each country with a percentage greater than 89% oredered by Percentage(desc)----------------------------------------------------
		
//		List<Object[]> countries = apiService.findLanguagesInAllCountriesOverPercentage(89F); 
//		for(Object[] country : countries) {
//			System.out.println("Country: " + country[0] + ", Languages over percent: " + country[1]);
//		}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------5. all the countries with Surface Area below 501 and Population greater than 100,000----------------------------------------------------
		
//		List<Country> countries = apiService.findCountriesLessThanSizeGreaterThanPopulation(501F, 100000L);
//		for(Country country : countries) {
//			System.out.println(country.getName());
//		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------6. get countries with only Constitutional Monarchy with a capital greater than 200 and a life expectancy greater than 75 years----------------------------------------------------
		
//		List<Country> countries = apiService.findCountriesWithGovtCapitalLifeExpentancy("constitutional monarchy", 200L, 75F);
//		for(Country country : countries) {
//			System.out.println(country.getName());
//		}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------7. get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500,000----------------------------------------------------		
		
//		List<Object[]> cities = apiService.findCitiesInCountryInDistrictWithPopulation("argentina", "buenos aires", 500000L);	
//		System.out.println(cities);
//		for(Object[] city : cities) {
//			System.out.println(city[0] + " " + city[1] + " " + city[2] + " " + city[3]);
//		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------8. Summarize the number of countries in each region--------------------------------------------------------------------------------------------------
		
//		List<Object[]> regions = apiService.findNumberOfCountriesInRegions();
//		for(Object[] region : regions) {
//			System.out.println("Region: " + region[0] + ", Countries: " + region[1]);
//		}
		
		return "index.jsp";
	}
	
	
	
}
