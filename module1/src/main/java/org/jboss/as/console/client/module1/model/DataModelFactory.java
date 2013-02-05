package org.jboss.as.console.client.module1.model;

import org.jboss.as.console.spi.BeanFactoryExtension;
import com.google.web.bindery.autobean.shared.AutoBean;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */
@BeanFactoryExtension
public interface DataModelFactory {
    AutoBean<Model1> getModel1();
}
