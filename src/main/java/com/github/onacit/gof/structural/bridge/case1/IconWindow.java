package com.github.onacit.gof.structural.bridge.case1;

abstract class IconWindow extends Window {

    void drawBorder() {
        drawRect();
        drawText();
    }
}
