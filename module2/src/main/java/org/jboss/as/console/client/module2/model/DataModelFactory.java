package org.jboss.as.console.client.module2.model;

import com.google.web.bindery.autobean.shared.AutoBean;
import org.jboss.as.console.spi.BeanFactoryExtension;

/**
 * @author Heiko Braun
 * @date 3/29/12
 */
@BeanFactoryExtension
public interface DataModelFactory {
    AutoBean<Model2> getModel2();
}
