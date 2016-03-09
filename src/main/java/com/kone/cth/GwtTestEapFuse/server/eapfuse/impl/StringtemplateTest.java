package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.stringtemplate.*;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class StringtemplateTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = StringtemplateTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("stringtemplate", new StringTemplateComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
