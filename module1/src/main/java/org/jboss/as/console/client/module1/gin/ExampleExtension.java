package org.jboss.as.console.client.module1.gin;

import com.google.gwt.inject.client.AsyncProvider;
import org.jboss.as.console.client.module1.HelloWorldPresenter;
import org.jboss.as.console.spi.GinExtension;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */

@GinExtension
public interface ExampleExtension {

    AsyncProvider<HelloWorldPresenter> getModule1Presenter();
}
