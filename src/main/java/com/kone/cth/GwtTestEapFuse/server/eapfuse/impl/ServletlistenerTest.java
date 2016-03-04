package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.component.servletlistener.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class ServletlistenerTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = ServletlistenerTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("servletlistener", (Component) new  SimpleCamelServletContextListener());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
