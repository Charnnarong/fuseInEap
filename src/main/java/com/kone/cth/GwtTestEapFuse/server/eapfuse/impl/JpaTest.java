package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jpa.JpaComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class JpaTest implements EapFuseComponentTest {
	
	@Override
	public String test() {
		String result = JpaTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("jpa", new JpaComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
