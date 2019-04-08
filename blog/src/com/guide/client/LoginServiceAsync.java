package com.guide.client;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	void loginService(String form, AsyncCallback<String> callback) throws IllegalArgumentException;
}
