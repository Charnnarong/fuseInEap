package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.component.ssh.SshComponent;
import org.apache.camel.impl.DefaultCamelContext;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class SshTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = SshTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			
			context.addComponent("ssh", new  SshComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}

}
