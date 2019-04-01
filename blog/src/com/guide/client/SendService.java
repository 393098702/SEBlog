package com.guide.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("send")
public interface SendService extends RemoteService{
	String sendServer(String info) throws IllegalArgumentException;
	
}
