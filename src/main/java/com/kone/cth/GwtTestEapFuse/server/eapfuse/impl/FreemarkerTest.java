package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.freemarker.FreemarkerComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class FreemarkerTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = FreemarkerTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("freemarker", new FreemarkerComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
