package com.sapient.service;

import com.sapient.service.dto.League;
import com.sapient.service.service.LeagueService;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class LeagueServiceImplTest {

	@Autowired
	private LeagueService leagueService;

	@Test
	public void getAllLeaguesByCountrySuccess() {
		List<League> countries = leagueService.getAllLeaguesByCountry("England");
		Assert.notEmpty(countries);
	}
	
}
