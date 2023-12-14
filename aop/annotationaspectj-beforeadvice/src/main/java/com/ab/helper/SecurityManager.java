package com.ab.helper;

public class SecurityManager {
	
	private static SecurityManager instance;
	private ThreadLocal<UserToken> threadLocal;
	
	private SecurityManager() {
		threadLocal = new ThreadLocal<>();
	}
	
	public static SecurityManager getInstance() {
		if(instance==null) {
			instance = new SecurityManager();
			return instance;
		}
		return instance;
	}
	
	public void login(String userName,String password) {
		UserToken token = new UserToken(userName, password);
		threadLocal.set(token);
	}
	
	public void logout() {
		threadLocal.set(null);
	}
	
	public boolean authenticate() {
		UserToken token = threadLocal.get();
		if(token.getUserName().equals("shubham") && token.getPassword().equals("1234")) {
			System.out.println(token.getUserName()+" logged in successfully");
			return true;
		}
		return false;
	}
	
	public String loggedInUser() {
		UserToken token = threadLocal.get();
		return token.getUserName();
	}
}
