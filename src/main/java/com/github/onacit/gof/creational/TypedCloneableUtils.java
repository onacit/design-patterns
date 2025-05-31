package com.github.onacit.gof.creational;

import java.lang.reflect.Method;
import java.util.Objects;

final class TypedCloneableUtils {

    private static final Method CLONE;

    static {
        try {
            CLONE = Object.class.getDeclaredMethod("clone");
            CLONE.setAccessible(true);
        } catch (final NoSuchMethodException nsme) {
            throw new ExceptionInInitializerError(nsme);
        }
    }

    static Object invokeClone(final Object object) {
        Objects.requireNonNull(object, "object is null");
        try {
            return CLONE.invoke(object);
        } catch (final ReflectiveOperationException roe) {
            throw new RuntimeException(roe);
        }
    }
}
