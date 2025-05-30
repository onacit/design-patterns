package com.github.onacit.gof.behavioral.command.structure;

abstract class ConcreteCommand extends Command {

    @Override
    void execute() {
        receiver.action();
    }

    // -----------------------------------------------------------------------------------------------------------------
    Receiver receiver;
}
