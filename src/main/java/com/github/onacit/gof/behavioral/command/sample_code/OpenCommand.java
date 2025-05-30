package com.github.onacit.gof.behavioral.command.sample_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OpenCommand extends SimpleCommand<Application> {

    OpenCommand(final Application receiver) {
        super(receiver, a -> {
            System.out.print("name of the document to open? ");
            try {
                final var name = new BufferedReader(new InputStreamReader(System.in)).readLine();
                final var document = new Document(name);
                a.add(document);
                document.open();
            } catch (final IOException ioe) {
                throw new RuntimeException(ioe);
            }
        });
    }
}
