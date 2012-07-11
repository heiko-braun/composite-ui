package org.jboss.as.console.client.module2.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import org.jboss.as.console.client.module2.HelloWorldPresenter;
import org.jboss.as.console.client.module2.HelloWorldView;
import org.jboss.as.console.spi.GinExtensionBinding;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */
@GinExtensionBinding
public class ExampleExtensionBinding extends AbstractPresenterModule {

    @Override
    protected void configure() {
        bindPresenter(HelloWorldPresenter.class,
                HelloWorldPresenter.MyView.class,
                HelloWorldView.class,
                HelloWorldPresenter.MyProxy.class);
    }


}
