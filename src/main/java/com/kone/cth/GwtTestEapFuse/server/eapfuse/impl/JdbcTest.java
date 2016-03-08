package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jdbc.JdbcComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class JdbcTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = JdbcTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("jdbc", new JdbcComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
