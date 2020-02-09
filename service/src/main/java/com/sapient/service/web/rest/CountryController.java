package com.sapient.service.web.rest;

import com.sapient.service.dto.Country;
import com.sapient.service.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> response = countryService.getAllCountries();
		if (!CollectionUtils.isEmpty(response)) {
			return ResponseEntity.ok(response);
		}
		else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/countries/{country_name}")
	public ResponseEntity<Country> getCountryByName(@PathVariable("country_name") String countryName) {
		Country country = countryService.getCountryByName(countryName);
		if (!Objects.isNull(country)) {
			return ResponseEntity.ok(country);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
