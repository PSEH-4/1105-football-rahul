package com.sapient.service.service;

import com.sapient.service.dto.Country;

import java.util.List;

public interface CountryService {

	List<Country> getAllCountries();

	Country getCountryByName(String countryName);

	Country getCountryById(String countryId);

}
