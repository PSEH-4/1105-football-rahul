package com.sapient.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Team extends Response {

	@JsonProperty("team_key")
	private String teamId;

	@JsonProperty("team_name")
	private String teamName;

	@JsonProperty("team_badge")
	private String teamBadge;
	
	private List<Player> players;
	
	private List<Coach> coaches;

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

	public String getTeamBadge() {
		return teamBadge;
	}

	public void setTeamBadge(String teamBadge) {
		this.teamBadge = teamBadge;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamResponse [teamId=");
		builder.append(teamId);
		builder.append(", teamName=");
		builder.append(teamName);
		builder.append(", teamBadge=");
		builder.append(teamBadge);
		builder.append(", players=");
		builder.append(players);
		builder.append(", coaches=");
		builder.append(coaches);
		builder.append("]");
		return builder.toString();
	}
	
	
}
