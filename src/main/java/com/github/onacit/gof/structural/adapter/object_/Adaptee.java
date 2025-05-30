package com.github.onacit.gof.structural.adapter.object_;

import static org.slf4j.LoggerFactory.getLogger;

interface Adaptee {

    default void SpecificRequest() {
        getLogger(getClass()).debug("SpecificRequest()");
    }
}
