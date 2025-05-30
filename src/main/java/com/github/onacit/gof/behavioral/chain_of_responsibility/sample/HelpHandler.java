package com.github.onacit.gof.behavioral.chain_of_responsibility.sample;

abstract class HelpHandler<SELF extends HelpHandler<SELF>> {

    static final int NO_HELP_TOPIC = -1;

    // -----------------------------------------------------------------------------------------------------------------
    HelpHandler() {
        super();
    }

    // -----------------------------------------------------------------------------------------------------------------
    boolean hasHelp() {
        return topic != NO_HELP_TOPIC;
    }

    void handleHelp() {
        if (successor != null) {
            successor.handleHelp();
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    HelpHandler<?> getSuccessor() {
        return successor;
    }

    void setSuccessor(final HelpHandler<?> successor) {
        this.successor = successor;
    }

    SELF successor(final HelpHandler<?> successor) {
        setSuccessor(successor);
        return (SELF) this;
    }

    // -----------------------------------------------------------------------------------------------------------------
    int getTopic() {
        return topic;
    }

    void setTopic(final int topic) {
        this.topic = topic;
    }

    SELF topic(final int topic) {
        setTopic(topic);
        return (SELF) this;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private HelpHandler<?> successor;

    private int topic = NO_HELP_TOPIC;
}
