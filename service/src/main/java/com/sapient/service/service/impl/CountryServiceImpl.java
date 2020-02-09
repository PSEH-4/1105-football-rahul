package com.sapient.service.service.impl;

import com.sapient.service.config.Constants;
import com.sapient.service.dto.Country;
import com.sapient.service.service.CountryService;
import com.sapient.service.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<Country> getAllCountries() {
		return (List<Country>) restUtil.doGet(Constants.GET_COUNTRIES);
	}

	@Override
	public Country getCountryByName(String countryName) {
		List<Country> countries = getAllCountries();
		Optional<Country> response = countries.stream().filter(country -> country.getCountryName().equalsIgnoreCase(countryName)).findAny();
		if (response.isPresent()) {
			return response.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Country getCountryById(String countryId) {
		List<Country> countries = getAllCountries();
		Optional<Country> response = countries.stream().filter(country -> country.getCountryId().equals(countryId)).findAny();
		if (response.isPresent()) {
			return response.get();
		}
		else {
			return null;
		}
	}
}
