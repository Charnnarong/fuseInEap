package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.ldap.LdapComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class LdapTest implements EapFuseComponentTest {
	
	@Override
	public String test() {
		String result = LdapTest.class.getName();
		try {
			CamelContext context = new DefaultCamelContext();
			context.addComponent("ldap", new LdapComponent());
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
