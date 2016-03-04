package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.ahc.AhcComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class CamelCoreTest implements EapFuseComponentTest {

	private Logger log = org.slf4j.LoggerFactory.getLogger(CamelCoreTest.class);

	@Override
	public String test() {

		

	
		String result = CamelCoreTest.class.getName();

		try{
		CamelContext context = new DefaultCamelContext();
		final List<String> isWork = new ArrayList<>();
		
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("timer:startTime?delay=200").process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						isWork.add("work");
						log.debug("Camel Timer Test OK");

					}
				}).log("done");

			}
		});
		context.start();
		Thread.sleep(1000);
		context.stop();
		result += " : Passed";
		}
		catch(Exception e)
		{
			result += e.getMessage();
		}

		return result;
	}

}
