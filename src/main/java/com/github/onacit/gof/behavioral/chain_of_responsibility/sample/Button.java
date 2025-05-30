package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Button extends Widget<Button> {

    static Button of(final Widget<?> parent, final int topic) {
        return of(Button::new, parent, topic);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Button() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void handleHelp() {
        if (hasHelp()) {
            log.debug("offering help on the button");
        } else {
            super.handleHelp();
        }
    }
}
