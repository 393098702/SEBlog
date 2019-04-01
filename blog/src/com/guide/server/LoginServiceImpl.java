package com.guide.server;

import com.guide.client.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
	public String loginService(String id) throws IllegalArgumentException{
		String result = "ÄãºÃ" + id;
		return result;
	}
	
}
