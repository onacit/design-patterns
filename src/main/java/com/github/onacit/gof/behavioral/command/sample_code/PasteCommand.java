package com.github.onacit.gof.behavioral.command.sample_code;

import java.util.function.Supplier;

class PasteCommand extends SimpleCommand<Supplier<? extends Document>> {

    PasteCommand(final Supplier<? extends Document> receiver) {
        super(receiver, r -> {
            r.get().paste("whatever");
        });
    }
}
