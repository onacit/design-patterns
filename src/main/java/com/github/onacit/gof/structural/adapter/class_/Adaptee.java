package com.github.onacit.gof.structural.adapter.class_;

import static org.slf4j.LoggerFactory.getLogger;

interface Adaptee {

    default void specificRequest() {
        getLogger(getClass()).debug("SpecificRequest()");
    }
}
