package com.sapient.service.service;

import com.sapient.service.dto.League;

import java.util.List;

public interface LeagueService {

	List<League> getAllLeaguesByCountry(String countryName);
}
