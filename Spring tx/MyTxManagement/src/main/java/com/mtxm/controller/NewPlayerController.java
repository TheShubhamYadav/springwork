package com.mtxm.controller;

import com.mtxm.form.TeamSelectionForm;
import com.mtxm.service.PlayerSelectionService;

public class NewPlayerController {
	
	private PlayerSelectionService playerSelectionService;

	public void setPlayerSelectionService(PlayerSelectionService playerSelectionService) {
		this.playerSelectionService = playerSelectionService;
	}
	
	public int newPlayer(TeamSelectionForm form) {
		int playerNo = 0;
		
		playerNo = playerSelectionService.newPlayer(form);
		
		return playerNo;
	}

}
