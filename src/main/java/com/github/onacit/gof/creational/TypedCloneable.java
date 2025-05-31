package com.github.onacit.gof.creational;

public interface TypedCloneable<SELF extends TypedCloneable<SELF>> extends Cloneable {

    default SELF cloneTyped() {
        return (SELF) TypedCloneableUtils.invokeClone(this);
    }
}
