package com.github.onacit.gof.structural.adapter.object_;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Client {


    public static void main(final String... args) {
        Client client = new Client();
        client.target = new Adapter(new Adaptee() {
        });
        log.debug("Invoking Target#Request()...");
        client.target.Request();
    }

    private Target target;
}
