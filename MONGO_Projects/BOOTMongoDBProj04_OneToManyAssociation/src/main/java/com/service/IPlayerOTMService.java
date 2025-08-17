package com.service;

import com.document.Player;

public interface IPlayerOTMService {

	public String savePlayerData(Player p);
	
	public void getPlayerData(int id);
}
