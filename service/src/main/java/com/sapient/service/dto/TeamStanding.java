package com.sapient.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamStanding extends Response {

	@JsonProperty("country_name")
	private String countryName;
	
	@JsonProperty("league_id")
	private String leagueId;

	@JsonProperty("league_name")
	private String leagueName;
	
	@JsonProperty("team_id")
	private String teamId;
	
	@JsonProperty("team_name")
	private String teamName;
	
	@JsonProperty("overall_league_position")
	private String overallLeaguePosition;
	
	@JsonProperty("overall_league_payed")
	private String overallLeaguePayed;
	
	@JsonProperty("overall_league_W")
	private String overallLeagueW;
	
	@JsonProperty("overall_league_D")
	private String overallLeagueD;
	
	@JsonProperty("overall_league_L")
	private String overalLeagueL;
	
	@JsonProperty("overall_league_GF")
	private String overallLeagueGF;
	
	@JsonProperty("overall_league_GA")
	private String overallLeagueGA;
	
	@JsonProperty("overall_league_PTS")
	private String overallLeaguePTS;
	
	@JsonProperty("home_league_position")
	private String homeLeaguePosition;
	
	@JsonProperty("home_league_payed")
	private String homeLeaguePayed;
	
	@JsonProperty("home_league_W")
	private String homeLeagueW;
	
	@JsonProperty("home_league_D")
	private String homeLeagueD;
	
	@JsonProperty("home_league_L")
	private String homeLeagueL;
	
	@JsonProperty("home_league_GF")
	private String homeLeagueGF;
	
	@JsonProperty("home_league_GA")
	private String homeLeagueGA;

	@JsonProperty("home_league_PTS")
	private String homeLeaguePTS;
	
	@JsonProperty("away_league_position")
	private String awayLeaguePosition;
	
	@JsonProperty("away_league_payed")
	private String awayLeaguePayed;
	
	@JsonProperty("away_league_W")
	private String awayLeagueW;
	
	@JsonProperty("away_league_D")
	private String awayLeagueD;
	
	@JsonProperty("away_league_L")
	private String awayLeagueL;
	
	@JsonProperty("away_league_GF")
	private String awayLeagueGF;
	
	@JsonProperty("away_league_GA")
	private String awayLeagueGA;

	@JsonProperty("away_league_PTS")
	private String awayLeaguePTS;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}

	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}

	public String getOverallLeaguePayed() {
		return overallLeaguePayed;
	}

	public void setOverallLeaguePayed(String overallLeaguePayed) {
		this.overallLeaguePayed = overallLeaguePayed;
	}

	public String getOverallLeagueW() {
		return overallLeagueW;
	}

	public void setOverallLeagueW(String overallLeagueW) {
		this.overallLeagueW = overallLeagueW;
	}

	public String getOverallLeagueD() {
		return overallLeagueD;
	}

	public void setOverallLeagueD(String overallLeagueD) {
		this.overallLeagueD = overallLeagueD;
	}

	public String getOveralLeagueL() {
		return overalLeagueL;
	}

	public void setOveralLeagueL(String overalLeagueL) {
		this.overalLeagueL = overalLeagueL;
	}

	public String getOverallLeagueGF() {
		return overallLeagueGF;
	}

	public void setOverallLeagueGF(String overallLeagueGF) {
		this.overallLeagueGF = overallLeagueGF;
	}

	public String getOverallLeagueGA() {
		return overallLeagueGA;
	}

	public void setOverallLeagueGA(String overallLeagueGA) {
		this.overallLeagueGA = overallLeagueGA;
	}

	public String getOverallLeaguePTS() {
		return overallLeaguePTS;
	}

	public void setOverallLeaguePTS(String overallLeaguePTS) {
		this.overallLeaguePTS = overallLeaguePTS;
	}

	public String getHomeLeaguePosition() {
		return homeLeaguePosition;
	}

	public void setHomeLeaguePosition(String homeLeaguePosition) {
		this.homeLeaguePosition = homeLeaguePosition;
	}

	public String getHomeLeaguePayed() {
		return homeLeaguePayed;
	}

	public void setHomeLeaguePayed(String homeLeaguePayed) {
		this.homeLeaguePayed = homeLeaguePayed;
	}

	public String getHomeLeagueW() {
		return homeLeagueW;
	}

	public void setHomeLeagueW(String homeLeagueW) {
		this.homeLeagueW = homeLeagueW;
	}

	public String getHomeLeagueD() {
		return homeLeagueD;
	}

	public void setHomeLeagueD(String homeLeagueD) {
		this.homeLeagueD = homeLeagueD;
	}

	public String getHomeLeagueL() {
		return homeLeagueL;
	}

	public void setHomeLeagueL(String homeLeagueL) {
		this.homeLeagueL = homeLeagueL;
	}

	public String getHomeLeagueGF() {
		return homeLeagueGF;
	}

	public void setHomeLeagueGF(String homeLeagueGF) {
		this.homeLeagueGF = homeLeagueGF;
	}

	public String getHomeLeagueGA() {
		return homeLeagueGA;
	}

	public void setHomeLeagueGA(String homeLeagueGA) {
		this.homeLeagueGA = homeLeagueGA;
	}

	public String getHomeLeaguePTS() {
		return homeLeaguePTS;
	}

	public void setHomeLeaguePTS(String homeLeaguePTS) {
		this.homeLeaguePTS = homeLeaguePTS;
	}

	public String getAwayLeaguePosition() {
		return awayLeaguePosition;
	}

	public void setAwayLeaguePosition(String awayLeaguePosition) {
		this.awayLeaguePosition = awayLeaguePosition;
	}

	public String getAwayLeaguePayed() {
		return awayLeaguePayed;
	}

	public void setAwayLeaguePayed(String awayLeaguePayed) {
		this.awayLeaguePayed = awayLeaguePayed;
	}

	public String getAwayLeagueW() {
		return awayLeagueW;
	}

	public void setAwayLeagueW(String awayLeagueW) {
		this.awayLeagueW = awayLeagueW;
	}

	public String getAwayLeagueD() {
		return awayLeagueD;
	}

	public void setAwayLeagueD(String awayLeagueD) {
		this.awayLeagueD = awayLeagueD;
	}

	public String getAwayLeagueL() {
		return awayLeagueL;
	}

	public void setAwayLeagueL(String awayLeagueL) {
		this.awayLeagueL = awayLeagueL;
	}

	public String getAwayLeagueGF() {
		return awayLeagueGF;
	}

	public void setAwayLeagueGF(String awayLeagueGF) {
		this.awayLeagueGF = awayLeagueGF;
	}

	public String getAwayLeagueGA() {
		return awayLeagueGA;
	}

	public void setAwayLeagueGA(String awayLeagueGA) {
		this.awayLeagueGA = awayLeagueGA;
	}

	public String getAwayLeaguePTS() {
		return awayLeaguePTS;
	}

	public void setAwayLeaguePTS(String awayLeaguePTS) {
		this.awayLeaguePTS = awayLeaguePTS;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamStandingResponse [countryName=");
		builder.append(countryName);
		builder.append(", leagueId=");
		builder.append(leagueId);
		builder.append(", leagueName=");
		builder.append(leagueName);
		builder.append(", teamId=");
		builder.append(teamId);
		builder.append(", teamName=");
		builder.append(teamName);
		builder.append(", overallLeaguePosition=");
		builder.append(overallLeaguePosition);
		builder.append(", overallLeaguePayed=");
		builder.append(overallLeaguePayed);
		builder.append(", overallLeagueW=");
		builder.append(overallLeagueW);
		builder.append(", overallLeagueD=");
		builder.append(overallLeagueD);
		builder.append(", overalLeagueL=");
		builder.append(overalLeagueL);
		builder.append(", overallLeagueGF=");
		builder.append(overallLeagueGF);
		builder.append(", overallLeagueGA=");
		builder.append(overallLeagueGA);
		builder.append(", overallLeaguePTS=");
		builder.append(overallLeaguePTS);
		builder.append(", homeLeaguePosition=");
		builder.append(homeLeaguePosition);
		builder.append(", homeLeaguePayed=");
		builder.append(homeLeaguePayed);
		builder.append(", homeLeagueW=");
		builder.append(homeLeagueW);
		builder.append(", homeLeagueD=");
		builder.append(homeLeagueD);
		builder.append(", homeLeagueL=");
		builder.append(homeLeagueL);
		builder.append(", homeLeagueGF=");
		builder.append(homeLeagueGF);
		builder.append(", homeLeagueGA=");
		builder.append(homeLeagueGA);
		builder.append(", homeLeaguePTS=");
		builder.append(homeLeaguePTS);
		builder.append(", awayLeaguePosition=");
		builder.append(awayLeaguePosition);
		builder.append(", awayLeaguePayed=");
		builder.append(awayLeaguePayed);
		builder.append(", awayLeagueW=");
		builder.append(awayLeagueW);
		builder.append(", awayLeagueD=");
		builder.append(awayLeagueD);
		builder.append(", awayLeagueL=");
		builder.append(awayLeagueL);
		builder.append(", awayLeagueGF=");
		builder.append(awayLeagueGF);
		builder.append(", awayLeagueGA=");
		builder.append(awayLeagueGA);
		builder.append(", awayLeaguePTS=");
		builder.append(awayLeaguePTS);
		builder.append("]");
		return builder.toString();
	}
	
	
}
