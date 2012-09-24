package org.jboss.as.console.client.module2.gin;

import com.google.gwt.inject.client.AsyncProvider;
import org.jboss.as.console.client.module2.HelloWorldPresenter;
import org.jboss.as.console.spi.GinExtension;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */

@GinExtension ("org.jboss.as.console.FooBar2")
public interface ExampleExtension {

    AsyncProvider<HelloWorldPresenter> getModule2Presenter();
}
