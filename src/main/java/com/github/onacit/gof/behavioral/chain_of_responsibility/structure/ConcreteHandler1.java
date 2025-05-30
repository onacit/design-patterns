package com.github.onacit.gof.behavioral.chain_of_responsibility.structure;

abstract class ConcreteHandler1 extends Handler {

    @Override
    void handle(Request request) {
        successor.handle(request);
    }
}
