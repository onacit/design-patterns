package com.github.onacit.gof.behavioral.command.sample_code;

class PasteCommand extends SimpleCommand<Document> {

    PasteCommand(final Document receiver) {
        super(receiver, r -> {
            r.paste("whatever");
        });
    }
}
