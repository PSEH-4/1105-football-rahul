package com.sapient.service.util;

import com.sapient.service.config.Constants;
import com.sapient.service.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class RestUtil {

	@Autowired
    RestTemplate restTemplate;

	@Value("${base.url}")
	private String baseUrl;

	@Value("${api.key}")
	private String apiKey;

	public List<? extends Response> doGet(String action) {
		return doGet(action, null);
	}

	public List<? extends Response> doGet(String action, Map<String, String> otherArgumements) {
		StringBuilder urlBuilder = new StringBuilder(baseUrl);
		urlBuilder.append("APIkey=");
		urlBuilder.append(apiKey);
		urlBuilder.append("&action=");
		urlBuilder.append(action);
		if (otherArgumements != null) {
			Set<String> otherArgumentKeys = otherArgumements.keySet();
			for (String otherArgumentKey : otherArgumentKeys) {
				urlBuilder.append("&");
				urlBuilder.append(otherArgumentKey);
				urlBuilder.append("=");
				urlBuilder.append(otherArgumements.get(otherArgumentKey));
			}
		}

		if (action.equals(Constants.GET_COUNTRIES)) {
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Country>>() {
					}).getBody();
		}
		else if (action.equals(Constants.GET_LEAGUES)){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<League>>() {
					}).getBody();
		}
		else if (action.equals(Constants.GET_TEAMS)){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Team>>() {
					}).getBody();
		}
		else if (action.equals(Constants.GET_STANDINGS)){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<TeamStanding>>() {
					}).getBody();
		}
		return new ArrayList<Response>();
	}
}
