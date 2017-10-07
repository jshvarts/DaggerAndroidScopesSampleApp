package com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 1 presenter dependencies.
 */
@Module
public abstract class Example1PresenterModule {
    @Binds
    @PerFragment
    abstract Example1Presenter example1Presenter(Example1PresenterImpl example1PresenterImpl);
}

