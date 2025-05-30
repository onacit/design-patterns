package com.github.onacit.gof.structural.adapter.object_;

import static org.slf4j.LoggerFactory.getLogger;

public class Adapter implements Target {

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        getLogger(getClass()).debug("invoking adaptee#SpecificRequest()");
        adaptee.SpecificRequest();
    }

    private final Adaptee adaptee;
}
