package com.jshvarts.daggerandroidsampleapp.util;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Utility class that is provided using Singleton scope in order to test this scope.
 */
@Singleton
public final class SingletonUtil {
    @Inject
    SingletonUtil() {
    }

    public String doSomething() {
        return "SingletonUtil: " + hashCode();
    }
}
