package com.guide.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

public class gwtGuide implements EntryPoint{
	
	private final LoginServiceAsync loginService = GWT.create(LoginService.class);
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
		leftButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String str = "弟中弟";
				loginService.loginService(str, new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						Window.alert("链接服务器失败");
					}
					
					public void onSuccess(String result) {
						String str1 = result;
						Window.alert(str1);
					}
				});
			}
		});
		
		Element span = DOM.getElementById("dd");
		span.setInnerText("嘻嘻嘻");
		
		Element btn = DOM.getElementById("send");
		DOM.sinkEvents(btn, Event.ONCLICK);
		DOM.setEventListener(btn, new EventListener() {
			@Override
			public void onBrowserEvent(Event event) {
				// TODO Auto-generated method stub
				if(DOM.eventGetType(event) == Event.ONCLICK){
					String text = DOM.getElementById("input").getNodeName();
					Window.alert(text);
				}
			}
		});
	}
}
