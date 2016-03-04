package com.kone.cth.GwtTestEapFuse.server;

import com.kone.cth.GwtTestEapFuse.client.GreetingService;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.EapFuseComponentTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.AhcTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.AmqpTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.ApnsTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.BeanValidatorTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.CacheTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.CamelCoreTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.ContextTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.EjbTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.FreemarkerTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.JettyTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.NettyTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.SshTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.XmlrpcTest;
import com.kone.cth.GwtTestEapFuse.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException("Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script
		// vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		return "Hello, " + input + "!<br><br>I am running " + serverInfo + ".<br><br>It looks like you are using:<br>"
				+ userAgent;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 *
	 * @param html
	 *            the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}

	@Override
	public String testCamelComponents() {

		String collectAllResult = "";

		collectAllResult += (new AhcTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new AmqpTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new ApnsTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new BeanValidatorTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new CacheTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new CamelCoreTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new ContextTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new EjbTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new FreemarkerTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new JettyTest()).test();
		collectAllResult += "\n";
		collectAllResult += (new NettyTest()).test();
		collectAllResult += "\n";

		return collectAllResult;

	}

	@Override
	public String testahc() {
		return (new AhcTest()).test();
	}

	@Override
	public String testamqp() {
		return (new AmqpTest()).test();
	}

	@Override
	public String testapns() {
		return (new ApnsTest()).test();
	}

	@Override
	public String testbeanvalidator() {
		return (new BeanValidatorTest()).test();
	}

	@Override
	public String testcache() {
		return (new CacheTest()).test();
	}

	@Override
	public String testcontext() {
		return (new ContextTest()).test();
	}

	@Override
	public String testejb() {
		return (new EjbTest()).test();
	}

	@Override
	public String testfreemarker() {
		return (new FreemarkerTest()).test();
	}

	@Override
	public String testjdbc() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testjetty() {
		return (new JettyTest()).test();
	}

	@Override
	public String testjpa() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testjt400() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testldap() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testmongodb() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testnetty() {

		return (new NettyTest()).test();
	}

	@Override
	public String testnettyhttp() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testprinter() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testquartz() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testservletlistener() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testsql() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testssh() {
		// TODO Auto-generated method stub
	    return (new SshTest()).test();
	}

	@Override
	public String teststringtemplate() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testurlrewrite() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testwebsocket() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testxmlrpc() {
		// TODO Auto-generated method stub
	    return (new XmlrpcTest()).test();
	}

	@Override
	public String testxmpp() {
		// TODO Auto-generated method stub
		return "Not yet Implemented the test.";
	}

	@Override
	public String testcamelcore() {
		return (new CamelCoreTest()).test();
	}

}
