package com.sapient.service;

import com.sapient.service.dto.Country;
import com.sapient.service.service.CountryService;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class CountryServiceImplTest {

	@Autowired
	private CountryService countryService;

	@Test
	public void getAllCountriesSuccess() {
		List<Country> countries = countryService.getAllCountries();
		Assert.notEmpty(countries);
	}

	
}
