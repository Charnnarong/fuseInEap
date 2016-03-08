package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.netty.http.NettyHttpComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class NettyHttpTest implements EapFuseComponentTest{

	@Override
	public String test() {
		String result = NettyHttpTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("netty-http", new NettyHttpComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
