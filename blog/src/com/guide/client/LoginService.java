package com.guide.client;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService{
	String loginService(String form) throws IllegalArgumentException;
}
