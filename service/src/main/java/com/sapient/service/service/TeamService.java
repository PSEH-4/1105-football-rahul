package com.sapient.service.service;

import com.sapient.service.dto.Team;

import java.util.List;

public interface TeamService {

	List<Team> getAllTeams();
	
	List<Team> getTeamByLeagueId(String leagueId);
}
