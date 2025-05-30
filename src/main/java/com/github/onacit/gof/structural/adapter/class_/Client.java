package com.github.onacit.gof.structural.adapter.class_;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Client {

    public static void main(final String... args) {
        new Client().target.request();
    }

    private final Target target = new Adapter() {
    };
}
