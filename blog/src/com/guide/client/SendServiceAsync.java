package com.guide.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
public interface SendServiceAsync {
	void sendServer(String str,AsyncCallback<String> callback)throws IllegalArgumentException;
}