package org.codehaus.groovy.grails.commons;

import org.springframework.context.ApplicationContext;

/**
 * @author Graeme Rocher
 * @since 0.4
 */
public interface ApplicationAttributes {

    String APPLICATION_CONTEXT = "org.codehaus.groovy.grails.APPLICATION_CONTEXT";
    String PARENT_APPLICATION_CONTEXT = "org.codehaus.groovy.grails.PARENT_APPLICATION_CONTEXT";
    String REQUEST_SCOPE_ID = "org.codehaus.groovy.grails.GRAILS_APPLICATION_ATTRIBUTES";
    String PLUGIN_MANAGER = "org.codehaus.groovy.grails.GRAILS_PLUGIN_MANAGER";

    /**
     * @return The application context for servlet
     */
    ApplicationContext getApplicationContext();

    /**
     * @return Retrieves the grails application instance
     */
    GrailsApplication getGrailsApplication();
}
