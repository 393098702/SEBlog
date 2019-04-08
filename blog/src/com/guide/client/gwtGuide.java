package com.guide.client;

import com.guide.shared.*;

import org.eclipse.jetty.util.ajax.JSON;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;

import com.google.gwt.user.client.EventListener;


public class gwtGuide implements EntryPoint{
	
	private final LoginServiceAsync loginService = (LoginServiceAsync)GWT.create(LoginService.class);
	public void onModuleLoad() {
		final Button rightButton = new Button("right");
		RootPanel.get("container").add(rightButton);
		
		rightButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("SSSSS");
			}
		});
		
		
		final Button leftButton = new Button("left");
		RootPanel.get("container").add(leftButton);
//		leftButton.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				String str = "弟中弟";
//				loginService.loginService(str, new AsyncCallback<String>() {
//					public void onFailure(Throwable caught) {
//						Window.alert("链接服务器失败");
//					}
//					
//					public void onSuccess(String result) {
//						String str1 = result;
//						Window.alert(str1);
//					}
//				});
//			}
//		});
	
		
		Element btn = DOM.getElementById("login");
		DOM.sinkEvents(btn, Event.ONCLICK);
		DOM.setEventListener(btn, new EventListener() {
			@Override
			public void onBrowserEvent(Event event) {
				// TODO Auto-generated method stub
				if(DOM.eventGetType(event) == Event.ONCLICK){
					String username = Operate.getValue("username");
					String password = Operate.getValue("password");
					Window.alert(username + password);
					if(username==null || password==null) {
						Window.alert("账号或密码不能为空");
						return;
					}
					if(!FieldVerifier.isValidPassword(password)) {
						Window.alert("密码长度应该为6-10位");
						return;
					}
					JSONObject form = new JSONObject();
					JSONString userName = new JSONString(username);
					JSONString passWord = new JSONString(password);
					form.put("username", userName);
					form.put("password",passWord);
					loginService.loginService(JSON.toString(form), new AsyncCallback<String>() {
						public void onFailure(Throwable caught) {
							Window.alert("连接服务器失败，请重试");
						}
						public void onSuccess(String result) {
							Window.alert("msg");
//							if(res.getString("code") == "1") {
//							
//							}
//							else {
//								Window.alert(result.getString("msg"));
//							}
						}
					});
				}
			}
		});
	}
}
