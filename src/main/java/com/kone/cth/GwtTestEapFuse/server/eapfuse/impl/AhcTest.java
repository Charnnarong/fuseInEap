package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.ahc.AhcComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class AhcTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = AhcTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("ahc", new AhcComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
