package com.simplilearn.list;

public class Players {

   
	
	public Players(String playerName, String playerPosition) {
		this.playerName = playerName;
		this.playerPosition = playerPosition;
	}

	String playerName;
	String playerPosition;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

}


