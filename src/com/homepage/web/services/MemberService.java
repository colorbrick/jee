package com.homepage.web.services;

public interface MemberService {
	public void join(String id, String password, String name, int age, String addr);
	
	public String login(String id, String password);
}
