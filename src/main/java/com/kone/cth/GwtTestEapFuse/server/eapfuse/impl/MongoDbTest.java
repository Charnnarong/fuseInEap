package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.mongodb.MongoDbComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class MongoDbTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = MongoDbTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("mongodb", new MongoDbComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
