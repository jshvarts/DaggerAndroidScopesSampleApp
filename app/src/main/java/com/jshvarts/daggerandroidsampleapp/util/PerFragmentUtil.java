package com.jshvarts.daggerandroidsampleapp.util;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Utility class that is provided using PerFragment scope in order to test this scope.
 */
@PerFragment
public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT) Fragment fragment) {
        this.fragment = fragment;
    }
    public String doSomething() {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode();
    }
}
