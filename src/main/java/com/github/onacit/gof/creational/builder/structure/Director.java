package com.github.onacit.gof.creational.builder.structure;

class Director {

    Director(final Builder builder) {
        super();
        this.builder = builder;
    }

    void construct() {
        builder.buildPart();
    }

    private final Builder builder;
}
