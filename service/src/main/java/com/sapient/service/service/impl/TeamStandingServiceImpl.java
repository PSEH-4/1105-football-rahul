package com.sapient.service.service.impl;

import com.sapient.service.config.Constants;
import com.sapient.service.dto.TeamStanding;
import com.sapient.service.service.TeamStandingService;
import com.sapient.service.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeamStandingServiceImpl implements TeamStandingService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<TeamStanding> getStandingByLeagueId(String leagueId) {
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("league_id", leagueId);
		return (List<TeamStanding>) restUtil.doGet(Constants.GET_STANDINGS, otherArguments);
	}

}