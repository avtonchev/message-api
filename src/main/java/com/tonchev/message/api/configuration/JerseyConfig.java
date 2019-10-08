package com.tonchev.message.api.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author atonchev
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.tonchev.message.api.resources");
    }
}
