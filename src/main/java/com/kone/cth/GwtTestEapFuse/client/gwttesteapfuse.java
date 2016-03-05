package com.kone.cth.GwtTestEapFuse.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.AhcTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.AmqpTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.ApnsTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.BeanvalidatorTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.CacheButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.CamelCoreTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.ContextButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.EjbButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.FreemarkerButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.JdbcButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.JettyButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.JpaTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.Jt400Button;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.LdapTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.MongoDbButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.NettyTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.NettyhttpButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.PrinterButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.QuartzTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.ServletlistenerTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.SqlTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.SshTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.StringtemplateTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.TestAllCamelComponents;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.UrlrewriteTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.WebsocketTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.XmlrpcTestButton;
import com.kone.cth.GwtTestEapFuse.client.testbuttons.XmppTestButton;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwttesteapfuse implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	private final Messages messages = GWT.create(Messages.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		VerticalPanel verticalPanel = new VerticalPanel();
		final VerticalPanel textAreaLeft = new VerticalPanel();
		final FlowPanel textAreaRight = new FlowPanel();
		HorizontalPanel buttonPanel = new HorizontalPanel();
		SimplePanel buttonsLeft = new SimplePanel();
		FlowPanel buttonsRight = new FlowPanel();

		RootPanel.get().getElement().getStyle().setMargin(10, Unit.PX);
		RootPanel.get().add(verticalPanel);

		verticalPanel.setWidth("100%");
		verticalPanel.setHeight("100%");
		buttonPanel.setWidth("100%");

		textAreaRight.getElement().getStyle().setProperty("margin", "10px");

		verticalPanel.add(buttonPanel);
		buttonsLeft.setWidth("100%");
		buttonsRight.setWidth("80%");
		buttonPanel.add(buttonsLeft);
		buttonPanel.add(buttonsRight);
		buttonPanel.setCellWidth(buttonsLeft, "50%");
		buttonPanel.setCellWidth(buttonsRight, "50%");

		buttonsRight.getElement().getStyle().setMarginLeft(10, Unit.PX);

		textAreaRight.getElement().getStyle().setPadding(10, Unit.PX);

		Label testLabel = new Label("Thes all components listed on the right.");
		Button testCamelAll = new Button("Test Camel Components");
		buttonsLeft.add(testCamelAll);

		testCamelAll.addClickHandler(new TestAllCamelComponents(greetingService, textAreaLeft));

		Button clearLog = new Button("CLEAR LOG");
		clearLog.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				textAreaRight.clear();
			}
		});
		clearLog.getElement().getStyle().setProperty("background", "none");
		clearLog.getElement().getStyle().setProperty("border", "1px solid blue");

		buttonsRight.add(new CamelCoreTestButton("core", textAreaRight, greetingService));
		buttonsRight.add(new AhcTestButton("ahc", textAreaRight, greetingService));
		buttonsRight.add(new AmqpTestButton("amqp", textAreaRight, greetingService));
		buttonsRight.add(new ApnsTestButton("apns", textAreaRight, greetingService));
		buttonsRight.add(new BeanvalidatorTestButton("beanvalidator", textAreaRight, greetingService));
		buttonsRight.add(new CacheButton("cache", textAreaRight, greetingService));
		buttonsRight.add(new ContextButton("context", textAreaRight, greetingService));
		buttonsRight.add(new EjbButton("ejb", textAreaRight, greetingService));
		buttonsRight.add(new FreemarkerButton("freemarker", textAreaRight, greetingService));
		buttonsRight.add(new JdbcButton("jdbc", textAreaRight, greetingService));
		buttonsRight.add(new JettyButton("jetty", textAreaRight, greetingService));
		buttonsRight.add(new JpaTestButton("jpa", textAreaRight, greetingService));
		buttonsRight.add(new Jt400Button("jt400", textAreaRight, greetingService));
		buttonsRight.add(new LdapTestButton("ldap", textAreaRight, greetingService));
		buttonsRight.add(new MongoDbButton("mongodb", textAreaRight, greetingService));
		buttonsRight.add(new NettyTestButton("netty", textAreaRight, greetingService));
		buttonsRight.add(new NettyhttpButton("nettyhttp", textAreaRight, greetingService));
		buttonsRight.add(new PrinterButton("printer", textAreaRight, greetingService));
		buttonsRight.add(new QuartzTestButton("quartz", textAreaRight, greetingService));
		buttonsRight.add(new ServletlistenerTestButton("servletlistener", textAreaRight, greetingService));
		buttonsRight.add(new SqlTestButton("sql", textAreaRight, greetingService));
		buttonsRight.add(new SshTestButton("ssh", textAreaRight, greetingService));
		buttonsRight.add(new StringtemplateTestButton("stringtemplate", textAreaRight, greetingService));
		buttonsRight.add(new UrlrewriteTestButton("urlrewrite", textAreaRight, greetingService));
		buttonsRight.add(new WebsocketTestButton("websocket", textAreaRight, greetingService));
		buttonsRight.add(new XmlrpcTestButton("xmlrpc", textAreaRight, greetingService));
		buttonsRight.add(new XmppTestButton("xmpp", textAreaRight, greetingService));
		buttonsRight.add(clearLog);

		HorizontalPanel resultPanel = new HorizontalPanel();
		verticalPanel.add(testLabel);
		verticalPanel.add(resultPanel);

		resultPanel.setWidth("100%");
		resultPanel.setHeight("100%");
		resultPanel.add(textAreaLeft);
		textAreaLeft.setWidth("100%");
		textAreaLeft.setHeight("100%");
		resultPanel.add(textAreaRight);
		textAreaRight.setWidth("100%");
		textAreaRight.setHeight("100%");
		resultPanel.setCellHeight(textAreaLeft, "100%");
		resultPanel.setCellHeight(textAreaRight, "100%");
		resultPanel.setCellWidth(textAreaLeft, "49%");
		resultPanel.setCellWidth(textAreaRight, "49%");

	}
}
