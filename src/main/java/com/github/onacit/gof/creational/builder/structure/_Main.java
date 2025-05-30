package com.github.onacit.gof.creational.builder.structure;

class _Main {

    public static void main(final String... args) {
        final var builder = new ConcreteBuilder();
        final var director = new Director(builder);
        director.construct();
        final var product = builder.getResult();
    }
}
