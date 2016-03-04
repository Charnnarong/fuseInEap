package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.ejb.EjbComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class EjbTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = EjbTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("ejb", new EjbComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
