package com.sapient.service;

import com.sapient.service.dto.TeamStanding;
import com.sapient.service.service.TeamStandingService;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class TeamStandingServiceImplTest {

	@Autowired
	private TeamStandingService teamStandingService;

	@Test
	public void getTeamStandingByLeagueIdSuccess() {
		List<TeamStanding> teamStandings = teamStandingService.getStandingByLeagueId("149");
		Assert.notEmpty(teamStandings);
	}

	
}
