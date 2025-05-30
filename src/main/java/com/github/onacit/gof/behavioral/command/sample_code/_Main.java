package com.github.onacit.gof.behavioral.command.sample_code;

class _Main {

    public static void main(final String... args) {
        final var application = new Application();
        {
            final var open = new OpenCommand(application);
            open.execute();
            final var paste = new PasteCommand(application.currentDocument().orElseThrow());
            paste.execute();
        }
        {
            final var open = new OpenCommand(application);
            open.execute();
            final var paste = new PasteCommand(application.currentDocument().orElseThrow());
            paste.execute();
            final var macro = new MacroCommand();
            macro.add(open);
            macro.add(paste);
            macro.execute();
        }
    }
}
