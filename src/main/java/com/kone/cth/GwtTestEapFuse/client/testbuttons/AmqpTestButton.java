package com.kone.cth.GwtTestEapFuse.client.testbuttons;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.kone.cth.GwtTestEapFuse.client.GreetingServiceAsync;

public class AmqpTestButton extends Button {

	public AmqpTestButton(String btnName, final FlowPanel textAreaRight,
			final GreetingServiceAsync greetingService) {

		super(btnName);

		addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				greetingService.testamqp(new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {
						Label lbl = new Label(result);
						lbl.getElement().getStyle().setProperty("margin", "2px");
						lbl.getElement().getStyle().setFontSize(14, Unit.PX);
						lbl.getElement().getStyle().setColor("00ffaa");
						textAreaRight.add(lbl);
						AmqpTestButton.this.getElement().getStyle().setProperty("background", "lightgreen");


					}

					@Override
					public void onFailure(Throwable caught) {
						Label lbl = new Label(caught.getMessage());
						lbl.getElement().getStyle().setProperty("margin", "2px");
						lbl.getElement().getStyle().setFontSize(14, Unit.PX);
						lbl.getElement().getStyle().setColor("ff00aa");
						textAreaRight.add(lbl);
						AmqpTestButton.this.getElement().getStyle().setProperty("background", "pink");

					}
				});

			}
		});
	}

}
