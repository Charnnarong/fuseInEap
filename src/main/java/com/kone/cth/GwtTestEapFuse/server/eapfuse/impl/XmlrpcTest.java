package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.xmlrpc.XmlRpcComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.Component;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class XmlrpcTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = XmlrpcTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("xmlrpc", (Component) new XmlRpcComponent() );
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
