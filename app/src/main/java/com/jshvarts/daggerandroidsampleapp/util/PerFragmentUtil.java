package com.jshvarts.daggerandroidsampleapp.util;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * A class that does something.
 * <p>
 * This class has the {@link PerFragment} scope. This means that the {@link android.app.Fragment}
 * and all of its child fragments and their dependencies will share the same instance of this class.
 * However, different fragment instances will have their own instances.
 * <p>
 * This is not available at the {@link android.app.Activity} and {@link android.app.Application}.
 */
@PerFragment
public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT) Fragment fragment) {
        this.fragment = fragment;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the fragment's {@link #hashCode()}.
     */
    public String doSomething() {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode();
    }
}