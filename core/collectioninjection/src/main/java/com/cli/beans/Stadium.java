package com.cli.beans;

import java.util.Map;
import java.util.Properties;

public class Stadium {
	Map<String, Game> matches;
	Properties winner;
	
	public void setMatches(Map<String, Game> matches) {
		this.matches = matches;
	}

	public void setWinner(Properties winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Stadium [matches=" + matches + ", winner=" + winner + "]";
	}
	

}
