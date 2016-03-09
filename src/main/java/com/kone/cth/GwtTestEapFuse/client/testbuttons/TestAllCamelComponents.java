package com.kone.cth.GwtTestEapFuse.client.testbuttons;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.kone.cth.GwtTestEapFuse.client.GreetingServiceAsync;

public class TestAllCamelComponents implements ClickHandler {

	private final GreetingServiceAsync greetingService;
	private VerticalPanel textAreaLeft;

	public TestAllCamelComponents(GreetingServiceAsync greetingService, VerticalPanel textAreaLeft2) {
		this.greetingService = greetingService;
		this.textAreaLeft = textAreaLeft2;
	}

	@Override
	public void onClick(ClickEvent event) {
		textAreaLeft.clear();

		greetingService.testahc(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Ahc", caught);
			}
		});
		greetingService.testamqp(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Ampq",caught);
			}
		});
		greetingService.testapns(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Apns", caught);
			}
		});
		greetingService.testbeanvalidator(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Bean Validator",caught);
			}
		});
		greetingService.testcache(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Cache",caught);
			}
		});
		greetingService.testcamelcore(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Camel Core",caught);
			}
		});
		greetingService.testcontext(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Context",caught);
			}
		});
		greetingService.testejb(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Ejb",caught);
			}
		});
		greetingService.testfreemarker(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Freemarker",caught);
			}
		});
		greetingService.testjdbc(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Jdbc",caught);
			}
		});
		greetingService.testjetty(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Jetty",caught);
			}
		});
		greetingService.testjpa(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Jpa",caught);
			}
		});
		greetingService.testjt400(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Jt400",caught);
			}
		});
		greetingService.testldap(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Ldap",caught);
			}
		});
		greetingService.testmongodb(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("MongoDb",caught);
			}
		});
		greetingService.testnettyhttp(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("NettyHttp",caught);
			}
		});
		greetingService.testnetty(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Netty",caught);
			}
		});
		greetingService.testprinter(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Printer",caught);
			}
		});
		greetingService.testquartz(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Quartz",caught);
			}
		});
		greetingService.testservletlistener(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Servlet Listener",caught);
			}
		});
		greetingService.testsql(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Sql",caught);
			}
		});
		greetingService.testssh(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Ssh",caught);
			}
		});
		greetingService.teststringtemplate(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Template",caught);
			}
		});
		greetingService.testurlrewrite(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Rewtrite",caught);
			}
		});
		greetingService.testwebsocket(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Websocket",caught);
			}
		});
		greetingService.testxmlrpc(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Xmlrpc",caught);
			}
		});
		greetingService.testxmpp(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				addSuccessResult(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				addFailedResult("Xmpp",caught);
			}
		});
		

	}

	private void addFailedResult(String testName , Throwable caught) {
		Label lbl = new Label(testName + " : " + caught.getMessage());
		lbl.getElement().getStyle().setProperty("margin", "2px");
		lbl.getElement().getStyle().setFontSize(14, Unit.PX);
		lbl.getElement().getStyle().setColor("red");
		textAreaLeft.add(lbl);
	}

	private void addSuccessResult(String result) {
		int lastIndexOfDot = result.lastIndexOf(".");
		Label lbl = new Label(result.substring(lastIndexOfDot + 1));
		lbl.getElement().getStyle().setProperty("margin", "2px");
		lbl.getElement().getStyle().setFontSize(14, Unit.PX);
		lbl.getElement().getStyle().setColor("green");
		textAreaLeft.add(lbl);
	}

}
