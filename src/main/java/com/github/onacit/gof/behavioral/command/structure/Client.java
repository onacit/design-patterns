package com.github.onacit.gof.behavioral.command.structure;

abstract class Client {

    void main() {
        final var command = new ConcreteCommand() {
        };
        command.receiver = new Receiver() {
            @Override
            void action() {
            }
        };

        final var invoker = new Invoker() {
        };
        invoker.command = command;
        invoker.invoke();
    }
}
