package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 2 B fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example2BFragmentModule.class)
public interface Example2BFragmentSubcomponent extends AndroidInjector<Example2BFragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2BFragment> {
    }
}
