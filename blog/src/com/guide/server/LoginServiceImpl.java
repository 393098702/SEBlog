package com.guide.server;

import com.guide.client.LoginService;

import org.eclipse.jetty.util.ajax.JSON;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
	@Override
	public String loginService(String form) throws IllegalArgumentException {
		JSONObject result = new JSONObject();
		JSONString code = new JSONString("1");
		result.put("code",code);
		return JSON.toString(result);
	}
	
}
