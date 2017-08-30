package com.jshvarts.daggerandroidsampleapp.ui.example_1;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 1 fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example1FragmentModule.class)
public interface Example1FragmentSubcomponent extends AndroidInjector<Example1Fragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Fragment> {
    }
}