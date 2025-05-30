package com.github.onacit.gof.creational.abstract_factory.structure;

class ConcreteFactory1 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
