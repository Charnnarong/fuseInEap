package com.kone.cth.GwtTestEapFuse.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.kone.cth.GwtTestEapFuse.client.GreetingService;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.AhcTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.AmqpTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.ApnsTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.BeanValidatorTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.CacheTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.CamelCoreTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.ContextTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.EjbTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.FreemarkerTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.JdbcTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.JettyTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.JpaTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.Jt400Test;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.LdapTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.MongoDbTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.NettyHttpTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.NettyTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.PrinterTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.QuartzTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.ServletlistenerTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.SqlTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.SshTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.StringtemplateTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.UrlRewriteTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.WebsocketTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.XmlrpcTest;
import com.kone.cth.GwtTestEapFuse.server.eapfuse.impl.XmppTest;
import com.kone.cth.GwtTestEapFuse.shared.FieldVerifier;

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
	    collectAllResult += (new XmlrpcTest()).test();
	    collectAllResult += "\n";
	    collectAllResult += (new SshTest()).test();
	    collectAllResult += "\n";
	    collectAllResult += (new XmppTest()).test();
	    collectAllResult += "\n";
	    collectAllResult += (new QuartzTest()).test();
	    collectAllResult += "\n";
	    collectAllResult += (new SqlTest()).test();
	    collectAllResult += "\n";
        collectAllResult += (new ServletlistenerTest()).test();
        collectAllResult += "\n"; 
        collectAllResult += (new StringtemplateTest()).test();
        collectAllResult += "\n"; 
        collectAllResult += (new WebsocketTest()).test();
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
		return (new JdbcTest()).test();
	}

	@Override
	public String testjetty() {
		return (new JettyTest()).test();
	}

	@Override
	public String testjpa() {
		return (new JpaTest()).test();
	}

	@Override
	public String testjt400() {
		return (new Jt400Test()).test();
	}

	@Override
	public String testldap() {
		return (new LdapTest().test());
	}

	@Override
	public String testmongodb() {
		return (new MongoDbTest()).test();
	}

	@Override
	public String testnetty() {

		return (new NettyTest()).test();
	}

	@Override
	public String testnettyhttp() {
		return (new NettyHttpTest()).test();
	}

	@Override
	public String testprinter() {
		return (new PrinterTest()).test();
	}

	@Override
	public String testquartz() {
        return (new QuartzTest()).test();
	}

	@Override
	public String testservletlistener() {
		return (new ServletlistenerTest()).test();
	}

	@Override
	public String testsql() {
        return (new SqlTest()).test();
	}

	@Override
	public String testssh() {
	    return (new SshTest()).test();
	}

	@Override
	public String teststringtemplate() {
        return (new StringtemplateTest()).test();
	}

	@Override
	public String testurlrewrite() {
		return (new UrlRewriteTest()).test();
	}

	@Override
	public String testwebsocket() {
        return (new WebsocketTest()).test();
	}

	@Override
	public String testxmlrpc() {
	    return (new XmlrpcTest()).test();
	}

	@Override
	public String testxmpp() {
        return (new XmppTest()).test();
	}

	@Override
	public String testcamelcore() {
		return (new CamelCoreTest()).test();
	}

}
