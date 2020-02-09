package com.sapient.service.web.rest;

import com.sapient.service.dto.League;
import com.sapient.service.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries/{country_name}/leagues")
public class LeagueController {

	@Autowired
	private LeagueService leagueService;

	@GetMapping
	public ResponseEntity<List<League>> getAllLeaguesByCountry(@PathVariable("country_name") String countryName) {
		List<League> response = leagueService.getAllLeaguesByCountry(countryName);
		if (!CollectionUtils.isEmpty(response)) {
			return ResponseEntity.ok(response);
		}
		else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

}
