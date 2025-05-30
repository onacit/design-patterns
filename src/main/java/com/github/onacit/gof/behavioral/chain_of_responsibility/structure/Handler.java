package com.github.onacit.gof.behavioral.chain_of_responsibility.structure;

abstract class Handler {

    abstract void handle(Request request);

    Handler successor;
}
