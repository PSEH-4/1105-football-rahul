package com.sapient.service.service.impl;

import com.sapient.service.config.Constants;
import com.sapient.service.dto.Country;
import com.sapient.service.dto.League;
import com.sapient.service.service.CountryService;
import com.sapient.service.service.LeagueService;
import com.sapient.service.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LeagueServiceImpl implements LeagueService {

	@Autowired
	private CountryService countryService;

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<League> getAllLeaguesByCountry(String countryName) {
		Country country = countryService.getCountryByName(countryName);
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("country_id", country.getCountryId());
		return (List<League>) restUtil.doGet(Constants.GET_LEAGUES, otherArguments);
	}
}
