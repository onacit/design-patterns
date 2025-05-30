package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

class Main {

    private static final int PRINT_TOPIC = 1;

    private static final int PAPER_ORIENTATION_TOPIC = 2;

    private static final int APPLICATION_TOPIC = 3;

    public static void main(final String... args) {
        final var application = Application.of(APPLICATION_TOPIC);
        final var dialog = Dialog.of(application, PRINT_TOPIC);
        final var button = Button.of(dialog, PAPER_ORIENTATION_TOPIC);
        button.handleHelp();
    }
}
