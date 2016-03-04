package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jetty.CamelHttpClient;
import org.apache.camel.component.jetty.JettyHttpComponent;
import org.apache.camel.component.jetty.JettyHttpEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.eclipse.jetty.server.AbstractConnector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.ssl.SslContextFactory;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class JettyTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = JettyTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("jetty", new JettyHttpComponent() {
				
				@Override
				protected JettyHttpEndpoint createEndpoint(URI arg0, URI arg1) throws URISyntaxException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				protected AbstractConnector createConnectorJettyInternal(Server arg0, JettyHttpEndpoint arg1,
						SslContextFactory arg2) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				protected CamelHttpClient createCamelHttpClient(SslContextFactory arg0) {
					// TODO Auto-generated method stub
					return null;
				}
			});
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
