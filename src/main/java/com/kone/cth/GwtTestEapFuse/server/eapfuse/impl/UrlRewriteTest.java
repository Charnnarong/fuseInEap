package com.kone.cth.GwtTestEapFuse.server.eapfuse.impl;

import org.apache.camel.component.urlrewrite.http.HttpUrlRewrite;

import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;

public class UrlRewriteTest implements EapFuseComponentTest {

	@Override
	public String test() {
		String result = UrlRewriteTest.class.getName();
		try {
			HttpUrlRewrite rewrite =new HttpUrlRewrite();
			rewrite.getCamelContext();
			result += " : Passed";
		} catch (Exception e) {
			result += " : " + e.getMessage();
		}

		return result;
	}
}
