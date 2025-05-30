package com.github.onacit.gof.behavioral.command.sample_code;

import java.util.Objects;
import java.util.function.Consumer;

abstract class SimpleCommand<RECEIVER> extends Command {

    SimpleCommand(final RECEIVER receiver, final Consumer<? super RECEIVER> action) {
        super();
        this.receiver = Objects.requireNonNull(receiver, "receiver is null");
        this.action = Objects.requireNonNull(action, "action is null");
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void execute() {
        action.accept(receiver);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final RECEIVER receiver;

    private final Consumer<? super RECEIVER> action;
}
