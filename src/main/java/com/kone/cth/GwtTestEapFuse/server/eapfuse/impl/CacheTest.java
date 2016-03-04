package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cache.CacheComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class CacheTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = CacheTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("cache", new CacheComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
