package com.jshvarts.daggerandroidsampleapp.util;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseChildFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * A class that does something.
 * <p>
 * This class has the {@link PerChildFragment} scope. This means that the child {@link Fragment}
 * (a fragment inside a fragment that is added using {@link Fragment#getChildFragmentManager()})
 * and all of its dependencies will share the same instance of this class.
 * However, different child fragments instances will have their own instances of this class.
 * <p>
 * This is not available at the parent {@link Fragment}, {@link android.app.Activity}
 * and {@link android.app.Application}.
 */
@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the child fragment's {@link #hashCode()}.
     */
    public String doSomething() {
        return "PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode();
    }
}