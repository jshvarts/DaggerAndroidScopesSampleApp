package com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 3 child presenter dependencies.
 */
@Module
public abstract class Example3ChildPresenterModule {

    @Binds
    @PerChildFragment
    abstract Example3ChildPresenter
    example3ChildPresenter(Example3ChildPresenterImpl example3ChildPresenterImpl);
}