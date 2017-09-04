package com.jshvarts.daggerandroidsampleapp.ui.example_2;

import com.jshvarts.daggerandroidsampleapp.di.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 2 activity dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerActivity
@Subcomponent(modules = Example2ActivityModule.class)
public interface Example2ActivitySubcomponent extends AndroidInjector<Example2Activity> {
    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example2Activity> {
    }
}
