package com.jshvarts.daggerandroidsampleapp.ui.example_1;

import com.jshvarts.daggerandroidsampleapp.di.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Injects example 1 activity dependencies.
 * <p>
 * TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
 */
@PerActivity
@Subcomponent(modules = Example1ActivityModule.class)
public interface Example1ActivitySubcomponent extends AndroidInjector<Example1Activity> {

    /**
     * The builder for this subcomponent.
     */
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Example1Activity> {
    }
}
