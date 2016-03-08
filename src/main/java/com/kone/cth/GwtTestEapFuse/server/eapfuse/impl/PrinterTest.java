package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.printer.PrinterComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class PrinterTest implements EapFuseComponentTest {
	
	@Override
	public String test() {
		String result = PrinterTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("lpr", new PrinterComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
