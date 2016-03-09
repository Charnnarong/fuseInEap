package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jdbc.JdbcComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class JdbcTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = JdbcTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("jdbc", new JdbcComponent());
			
			context.addRoutes(new  RouteBuilder() {
				
				@Override
				 public void configure() throws Exception {
					// TODO Auto-generated method stub
					from("direct:hello")
					// here we split the data from the testdb into new messages one by one
					// so the mock endpoint will receive a message per row in the table
					// the StreamList option allows to stream the result of the query without creating a List of rows
					// and notice we also enable streaming mode on the splitter
					.to("jdbc:testdb?outputType=StreamList")
					  .split(body()).streaming()
					  .to("mock:result");
				}
			});
			
			
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
