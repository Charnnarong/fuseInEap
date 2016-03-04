package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.ahc.AhcComponent;
import org.apache.camel.component.netty.NettyComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class NettyTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = NettyTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("netty", new NettyComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
