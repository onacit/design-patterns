package com.github.onacit.gof.creational.builder.structure;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ConcreteBuilder extends Builder {

    @Override
    void buildPart() {
        log.debug("building part...");
    }

    Product getResult() {
        return new Product() {
        };
    }
}
