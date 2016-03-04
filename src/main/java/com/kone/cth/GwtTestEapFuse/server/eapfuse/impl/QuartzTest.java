package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.quartz.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class QuartzTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = QuartzTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("quartz", new  QuartzComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
