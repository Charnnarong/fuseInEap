package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.websocket.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class WebsocketTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = WebsocketTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("websocket", new  WebsocketComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
