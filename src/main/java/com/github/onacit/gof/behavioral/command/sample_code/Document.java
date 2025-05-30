package com.github.onacit.gof.behavioral.command.sample_code;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
class Document {

    Document(final String name) {
        super();
        this.name = Objects.requireNonNull(name, "name is null");
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return super.toString() + '{' +
                "name=" + name +
                '}';
    }

    // -----------------------------------------------------------------------------------------------------------------
    void open() {
        log.debug("opening '{}'", this);
    }

    void paste(final String value) {
        log.debug("pasting... '{}' to {}", value, this);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final String name;
}
