package com.github.onacit.gof.creational.prototype.structure;

class Client {

    void operation() throws CloneNotSupportedException {
        final var p = prototype.clone();
    }

    private Prototype<?> prototype;
}
