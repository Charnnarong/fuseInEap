package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class ContextTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = ContextTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();

			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
