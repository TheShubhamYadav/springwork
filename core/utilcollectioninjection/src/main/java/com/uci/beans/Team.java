package com.uci.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Team {
	List<String> players;
	Map<String, Integer> scorecard;
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	public void setScorecard(Map<String, Integer> scorecard) {
		this.scorecard = scorecard;
	}
	@Override
	public String toString() {
		return "Team [players=" + players + ", scorecard=" + scorecard + "]";
	}
	
	

}
