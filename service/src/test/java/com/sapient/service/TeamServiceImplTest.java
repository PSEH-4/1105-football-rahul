package com.sapient.service;

import com.sapient.service.dto.Team;
import com.sapient.service.service.TeamService;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class TeamServiceImplTest {

	@Autowired
	private TeamService teamService;

	@Test
	public void getAllTeamsSuccess() {
		List<Team> countries = teamService.getAllTeams();
		Assert.notEmpty(countries);
	}

	
}
