package com.mtxm.service;

import com.mtxm.bo.Player;
import com.mtxm.bo.Team;
import com.mtxm.dao.PlayerDao;
import com.mtxm.dao.TeamDao;
import com.mtxm.form.TeamSelectionForm;

public class PlayerSelectionService {
	private PlayerDao pdao;
	private TeamDao tdao;
	
	public int newPlayer(TeamSelectionForm form) {
		int playerNo = 0;
		int teamNo=0;
		Player player = new Player();
		Team team  = new Team();
		
		team.setTeamName(form.getTeamName());
		team.setLevel(form.getLevel());
		team.setTeamManagerName(form.getTeamManagerName());
		team.setTeamType(form.getTeamType());
		
		teamNo = tdao.saveTeam(team);
		
		player.setAge(form.getAge());
		player.setEmail(form.getEmail());
		player.setGender(form.getGender());
		player.setPlayerName(form.getPlayerName());
		player.setSportType(form.getSportType());
		player.setTeamId(teamNo);
		
		playerNo = pdao.savePlayer(player);
		return playerNo;
		
	}

	public void setPdao(PlayerDao pdao) {
		this.pdao = pdao;
	}

	public void setTdao(TeamDao tdao) {
		this.tdao = tdao;
	}
	
	
	
	
}
