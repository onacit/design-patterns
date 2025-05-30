package com.github.onacit.gof.behavioral.command.sample_code;

abstract class Command {

    Command() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------
    abstract void execute();
}
