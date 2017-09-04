package com.jshvarts.daggerandroidsampleapp.ui.example_3;

import com.jshvarts.daggerandroidsampleapp.di.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 3 activity dependencies.
 */
@PerActivity
@Subcomponent(modules = Example3ActivityModule.class)
public interface Example3ActivitySubcomponent extends AndroidInjector<Example3Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example3Activity> {
    }
}
