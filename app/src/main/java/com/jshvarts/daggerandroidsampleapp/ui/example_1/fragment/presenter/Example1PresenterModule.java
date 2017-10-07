package com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 1 presenter dependencies.
 */
@Module
public abstract class Example1PresenterModule {
    // We are using @Binds annotation to provide an interface with an instance of a concrete class.
    @Binds
    @PerFragment
    abstract Example1Presenter example1Presenter(Example1PresenterImpl example1PresenterImpl);
}

