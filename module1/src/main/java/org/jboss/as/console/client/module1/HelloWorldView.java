package org.jboss.as.console.client.module1;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import org.jboss.as.console.client.core.SuspendableViewImpl;
import org.jboss.as.console.client.module1.model.Model1;
import org.jboss.as.console.client.layout.SimpleLayout;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */
public class HelloWorldView extends SuspendableViewImpl implements HelloWorldPresenter.MyView {
    private HelloWorldPresenter presenter;
    private Label label;

    @Override
    public void setPresenter(HelloWorldPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setData(Model1 data) {
        label.setText(data.getGreeting());
    }

    @Override
    public Widget createWidget() {

        label = new Label();

        SimpleLayout layout = new SimpleLayout()
                .setTitle("Module 1")
                .setHeadlineWidget(label)
                .setDescription("Hello, I am module 1!");

        return layout.build();
    }
}
