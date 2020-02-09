package com.sapient.service.web.rest;

import com.sapient.service.dto.League;
import com.sapient.service.dto.TeamStanding;
import com.sapient.service.service.LeagueService;
import com.sapient.service.service.TeamStandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries/{country_name}/leagues/{league_name}/standings")
public class TeamStandingController {

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamStandingService teamStandingService;

	@GetMapping
	public ResponseEntity<List<TeamStanding>> getAllTeamStandings(@PathVariable("country_name") String countryName, @PathVariable("league_name") String leagueName) {
		List<League> leagues = leagueService.getAllLeaguesByCountry(countryName);
		Optional<League> result = leagues.stream().filter(league -> league.getLeagueName().equalsIgnoreCase(leagueName)).findAny();
		if (result.isPresent()) {
			String leagueId = result.get().getLeagueId();
			return ResponseEntity.ok(teamStandingService.getStandingByLeagueId(leagueId));
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
