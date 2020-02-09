package com.sapient.service.web.rest;

import com.sapient.service.dto.League;
import com.sapient.service.dto.Team;
import com.sapient.service.service.LeagueService;
import com.sapient.service.service.TeamService;
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
@RequestMapping("/api/v1/countries/{country_name}/leagues/{league_name}/teams")
public class TeamController {

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamService teamService;

	@GetMapping
	public ResponseEntity<List<Team>> getAllTeam(@PathVariable("country_name") String countryName, @PathVariable("league_name") String leagueName) {
		List<League> leagues = leagueService.getAllLeaguesByCountry(countryName);
		Optional<League> result = leagues.stream().filter(league -> league.getLeagueName().equalsIgnoreCase(leagueName)).findAny();
		if (result.isPresent()) {
			String leagueId = result.get().getLeagueId();
			return ResponseEntity.ok(teamService.getTeamByLeagueId(leagueId));
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
