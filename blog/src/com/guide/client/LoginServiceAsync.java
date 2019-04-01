package com.guide.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	void loginService(String str, AsyncCallback<String> callback) throws IllegalArgumentException;
}
