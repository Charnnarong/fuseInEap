package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class AmqpTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = AmqpTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("ampq", new AMQPComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
