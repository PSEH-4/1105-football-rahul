package com.sapient.service.service;

import com.sapient.service.dto.TeamStanding;

import java.util.List;

public interface TeamStandingService {

	List<TeamStanding> getStandingByLeagueId(String leagueId);
}
