package com.ajba.helper;

public class SecurityManager {
	private static SecurityManager instance;
	private ThreadLocal<CredentialToken> threadLocal;
	
	private SecurityManager () {
		threadLocal = new ThreadLocal<>();
	}
	
	public static synchronized SecurityManager getInstance() {
		if(instance==null) {
			instance = new SecurityManager();
			return instance;
		}
		return instance;
	}
	
	public void login(String user, String password) {
		CredentialToken token = new CredentialToken(user, password);
		threadLocal.set(token);
	}
	
	public void logout() {
		threadLocal.set(null);
	}
	
	public boolean authenticate() {
		CredentialToken token = threadLocal.get();
		if(token!=null) {
			if(token.getUsername().equals("shubham") && token.getPassword().equals("1234")) {
				return true;
			}
		}
		return false;
	}
	
	public String getLoggedInUser() {
		CredentialToken token = threadLocal.get();
		if(token!=null)
			return token.getUsername();
		return null;
	}

}
