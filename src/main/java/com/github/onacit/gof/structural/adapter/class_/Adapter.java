package com.github.onacit.gof.structural.adapter.class_;

import static org.slf4j.LoggerFactory.getLogger;

interface Adapter extends Target, Adaptee {

    default void request() {
        getLogger(getClass()).debug("invoking Adaptee#specificRequest()");
        specificRequest();
    }
}
