package com.sapient.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player extends Response {

	@JsonProperty("player_key")
	private String playerKey;
	
	@JsonProperty("player_name")
	private String playerName;
	
	@JsonProperty("player_number")
	private String playerNumber;
	
	@JsonProperty("player_country")
	private String playerCountry;
	
	@JsonProperty("player_type")
	private String playerType;
	
	@JsonProperty("player_age")
	private String playerAge;
	
	@JsonProperty("player_match_played")
	private String playerMatchPlayed;
	
	@JsonProperty("player_goals")
	private String playerGoals;
	
	@JsonProperty("player_yellow_cards")
	private String playerYellowCards;
	
	@JsonProperty("player_red_cards")
	private String playerRedCards;

	public String getPlayerKey() {
		return playerKey;
	}

	public void setPlayerKey(String playerKey) {
		this.playerKey = playerKey;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public String getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerMatchPlayed() {
		return playerMatchPlayed;
	}

	public void setPlayerMatchPlayed(String playerMatchPlayed) {
		this.playerMatchPlayed = playerMatchPlayed;
	}

	public String getPlayerGoals() {
		return playerGoals;
	}

	public void setPlayerGoals(String playerGoals) {
		this.playerGoals = playerGoals;
	}

	public String getPlayerYellowCards() {
		return playerYellowCards;
	}

	public void setPlayerYellowCards(String playerYellowCards) {
		this.playerYellowCards = playerYellowCards;
	}

	public String getPlayerRedCards() {
		return playerRedCards;
	}

	public void setPlayerRedCards(String playerRedCards) {
		this.playerRedCards = playerRedCards;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlayerResponse [playerKey=");
		builder.append(playerKey);
		builder.append(", playerName=");
		builder.append(playerName);
		builder.append(", playerNumber=");
		builder.append(playerNumber);
		builder.append(", playerCountry=");
		builder.append(playerCountry);
		builder.append(", playerType=");
		builder.append(playerType);
		builder.append(", playerAge=");
		builder.append(playerAge);
		builder.append(", playerMatchPlayed=");
		builder.append(playerMatchPlayed);
		builder.append(", playerGoals=");
		builder.append(playerGoals);
		builder.append(", playerYellowCards=");
		builder.append(playerYellowCards);
		builder.append(", playerRedCards=");
		builder.append(playerRedCards);
		builder.append("]");
		return builder.toString();
	}
	
}
