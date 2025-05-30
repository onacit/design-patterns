package com.github.onacit.gof.behavioral.command.structure;

abstract class Invoker {

    void invoke() {
        command.execute();
    }

    Command command;
}
