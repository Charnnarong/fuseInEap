package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.xmpp.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class XmppTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = XmppTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("xmpp", new  XmppComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
