package com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 3 child fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerChildFragment
@Subcomponent(modules = Example3ChildFragmentModule.class)
public interface Example3ChildFragmentSubcomponent extends AndroidInjector<Example3ChildFragment> {
    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3ChildFragment> {
    }
}
