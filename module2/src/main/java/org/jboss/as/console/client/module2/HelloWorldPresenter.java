package org.jboss.as.console.client.module2;

import com.google.web.bindery.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Place;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.Proxy;
import org.jboss.as.console.client.module2.model.Model2;
import org.jboss.as.console.client.shared.BeanFactory;
import org.jboss.as.console.client.shared.subsys.RevealStrategy;
import org.jboss.as.console.spi.SubsystemExtension;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */
public class HelloWorldPresenter extends Presenter<HelloWorldPresenter.MyView, HelloWorldPresenter.MyProxy> {

    private final PlaceManager placeManager;
    private BeanFactory factory;
    private RevealStrategy revealStrategy;

    @ProxyCodeSplit
    @NameToken("module2")
    @SubsystemExtension(name="Module2 UI", group = "Extensions", key="logging")  // fake key, otherwise it would not be loaded
    public interface MyProxy extends Proxy<HelloWorldPresenter>, Place {
    }

    public interface MyView extends View {
        void setPresenter(HelloWorldPresenter presenter);
        void setData(Model2 data);
    }

    @Inject
    public HelloWorldPresenter(
            EventBus eventBus, MyView view, MyProxy proxy,
            PlaceManager placeManager, BeanFactory factory,
            RevealStrategy revealStrategy) {
        super(eventBus, view, proxy);

        this.placeManager = placeManager;
        this.factory = factory;
        this.revealStrategy = revealStrategy;
    }

    @Override
    protected void onBind() {
        super.onBind();
        getView().setPresenter(this);
    }


    @Override
    protected void onReset() {
        super.onReset();


        // populate data model, i.e. from remote call
        Model2 model = factory.getModel2().as();
        model.setGreeting("Hello World");

        // update view
        getView().setData(model);
    }

    @Override
    protected void revealInParent() {
        revealStrategy.revealInParent(this);
    }
}
