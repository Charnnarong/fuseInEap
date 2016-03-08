package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jt400.Jt400Component;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class Jt400Test implements EapFuseComponentTest {
	
	@Override
	public String test() {
		String result = Jt400Test.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("jt400", new Jt400Component());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
