package com.github.onacit.gof.creational.prototype.structure;

abstract class Prototype<SELF extends Prototype<SELF>> implements Cloneable {

    protected SELF clone() throws CloneNotSupportedException {
        return (SELF) super.clone();
    }
}
