package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 3 parent fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example3ParentFragmentModule.class)
public interface Example3ParentFragmentSubcomponent extends AndroidInjector<Example3ParentFragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3ParentFragment> {
    }
}
