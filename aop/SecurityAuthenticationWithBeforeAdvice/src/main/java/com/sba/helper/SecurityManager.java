package com.sba.helper;

import com.sba.beans.CredentialToken;

public class SecurityManager {
	private static SecurityManager instance;
	private ThreadLocal<CredentialToken> threadLocal;
	
	private SecurityManager() {
		threadLocal = new ThreadLocal<>();
	}

	public static synchronized SecurityManager getInstance() {
		if(instance==null) {
			instance = new SecurityManager();
		}
		return instance;
	}
	
	public void login(String user, String password) {
		CredentialToken ct = new CredentialToken(user, password);
		threadLocal.set(ct);
	}
	
	public boolean authenticate() {
		CredentialToken cToken  = null;
		cToken = threadLocal.get();
		if(cToken!=null) {
			if(cToken.getUserName().equals("BOB") && cToken.getPassword().equals("PS5")) {
				return true; 
			}
			//return false;
		}
		return false;
	}
	
	public void logout() {
		threadLocal.set(null);
	}
	
	public String getLoggedInUser() {
		CredentialToken ct = null;
		ct = threadLocal.get();
		if(ct!=null) {
			return ct.getUserName();
		}
		return "currently no user loggedin";
	}
}
