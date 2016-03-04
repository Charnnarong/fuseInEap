package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.apns.ApnsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class ApnsTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = ApnsTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("apns", new ApnsComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
