package com.github.onacit.gof.structural.bridge.case1;

abstract class TransientWindow extends Window {

    void drawCloseBox() {
        drawRect();
    }
}
