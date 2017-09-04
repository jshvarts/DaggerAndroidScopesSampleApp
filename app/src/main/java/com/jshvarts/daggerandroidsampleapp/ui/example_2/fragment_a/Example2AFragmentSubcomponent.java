package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 2 A fragment dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerFragment
@Subcomponent(modules = Example2AFragmentModule.class)
public interface Example2AFragmentSubcomponent extends AndroidInjector<Example2AFragment> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2AFragment> {
    }
}
