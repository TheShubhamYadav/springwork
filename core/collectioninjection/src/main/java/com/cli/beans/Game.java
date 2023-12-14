package com.cli.beans;

import java.util.List;
import java.util.Set;

public class Game {
	List<String> team1;
	List<String> team2;
	Set<String> umpires;
	public List<String> getTeam1() {
		return team1;
	}
	public void setTeam1(List<String> team1) {
		this.team1 = team1;
	}
	public List<String> getTeam2() {
		return team2;
	}
	public void setTeam2(List<String> team2) {
		this.team2 = team2;
	}
	public Set<String> getUmpires() {
		return umpires;
	}
	public void setUmpires(Set<String> umpires) {
		this.umpires = umpires;
	}
	@Override
	public String toString() {
		return "team1=" + team1 + "\nteam2=" + team2 + "\numpires=" + umpires;
	}
	
	

	

}
