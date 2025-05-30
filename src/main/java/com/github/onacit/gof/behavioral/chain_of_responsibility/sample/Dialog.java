package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Dialog extends Widget<Dialog> {

    static Dialog of(final HelpHandler<?> successor, final int topic) {
        return of(Dialog::new, null, topic)
                .successor(successor);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Dialog() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void handleHelp() {
        if (hasHelp()) {
            log.debug("offering help on the dialog...");
        } else {
            super.handleHelp();
        }
    }
}
