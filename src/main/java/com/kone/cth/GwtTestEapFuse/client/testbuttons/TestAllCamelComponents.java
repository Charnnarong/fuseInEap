package com.kone.cth.GwtTestEapFuse.client.testbuttons;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.kone.cth.GwtTestEapFuse.client.GreetingServiceAsync;

public class TestAllCamelComponents implements ClickHandler {

	private final GreetingServiceAsync greetingService;
	private TextArea textAreaLeft;
	
	public TestAllCamelComponents(GreetingServiceAsync greetingService,TextArea textAreaLeft) {
		this.greetingService = greetingService;
		this.textAreaLeft = textAreaLeft;
	}

	@Override
	public void onClick(ClickEvent event) {
		
//		greetingService.testCamelComponents(
//				new AsyncCallback<String>() {
//
//			@Override
//			public void onSuccess(String result) {
//				String orgText = textAreaLeft.getText();
//				textAreaLeft.setText(orgText + "\ntestCamelJetty : " + result);
//			}
//
//			@Override
//			public void onFailure(Throwable caught) {
//				String orgText = textAreaLeft.getText();
//				textAreaLeft.setText(orgText + "\ntestCamelJetty : " + caught.getMessage());
//
//			}
			
			
//		});

	

	}

}
