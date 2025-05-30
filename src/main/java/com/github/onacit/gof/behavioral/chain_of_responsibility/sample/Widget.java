package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

import java.util.Objects;
import java.util.function.Supplier;

abstract class Widget<SELF extends Widget<SELF>> extends HelpHandler<SELF> {

    static <T extends Widget<T>> T of(final Supplier<? extends T> initializer, Widget<?> parent, final int topic) {
        return Objects.requireNonNull(initializer.get(), "initializer.get() is null")
                .parent(parent)
                .topic(topic);
    }
    // -----------------------------------------------------------------------------------------------------------------

    Widget() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------

    Widget<?> getParent() {
        return parent;
    }

    void setParent(final Widget<?> parent) {
        this.parent = parent;
    }

    SELF parent(final Widget<?> parent) {
        setParent(parent);
        return (SELF) this;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Widget<?> parent;
}
