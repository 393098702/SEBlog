package com.guide.server;

import com.guide.client.SendService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class SendServiceImpl extends RemoteServiceServlet implements SendService {

	@Override
	public String sendServer(String info) throws IllegalArgumentException {
		return info;
	}
}
