package com.github.onacit.gof.creational.factory_method.structure;

class ConcreteCreator extends Creator {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    void anOperation() {
    }
}
