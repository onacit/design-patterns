package com.github.onacit.gof.behavioral.interpreter.structure;

abstract class AbstractExpression {

    AbstractExpression() {
        super();
    }

    abstract void interpret(Context context);
}
