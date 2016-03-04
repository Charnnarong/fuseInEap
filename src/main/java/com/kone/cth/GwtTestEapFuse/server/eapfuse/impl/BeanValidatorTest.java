package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.bean.validator.BeanValidatorComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class BeanValidatorTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = BeanValidatorTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("beanvalidator", new BeanValidatorComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
