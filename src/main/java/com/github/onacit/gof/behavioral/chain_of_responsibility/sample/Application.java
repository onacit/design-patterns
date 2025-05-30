package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Application extends HelpHandler<Application> {

    static Application of(final int topic) {
        return new Application().topic(topic);
    }

    // -----------------------------------------------------------------------------------------------------------------
    Application() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void handleHelp() {
        log.debug("showing a list of help topics");
    }
}
