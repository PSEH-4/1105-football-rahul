package com.sapient.service.service.impl;

import com.sapient.service.config.Constants;
import com.sapient.service.dto.Team;
import com.sapient.service.service.TeamService;
import com.sapient.service.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<Team> getAllTeams() {
		return (List<Team>) restUtil.doGet(Constants.GET_TEAMS);
	}

	@Override
	public List<Team> getTeamByLeagueId(String leagueId) {
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("league_id", leagueId);
		return (List<Team>) restUtil.doGet(Constants.GET_TEAMS, otherArguments);
	}

}