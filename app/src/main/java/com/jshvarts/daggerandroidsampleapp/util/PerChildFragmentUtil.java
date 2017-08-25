package com.jshvarts.daggerandroidsampleapp.util;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseChildFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Utility class that is provided using PerChildFragment scope in order to test this scope.
 */
@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }
    public String doSomething() {
        return "PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode();
    }
}
