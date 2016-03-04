package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.sql.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class SqlTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = SqlTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("sql", new  SqlComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
