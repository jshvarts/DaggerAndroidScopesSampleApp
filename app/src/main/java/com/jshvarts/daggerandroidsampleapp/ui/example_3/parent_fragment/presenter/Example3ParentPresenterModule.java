package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 3 parent presenter dependencies.
 */
@Module
public abstract class Example3ParentPresenterModule {

    @Binds
    @PerFragment
    abstract Example3ParentPresenter
    example3ParentPresenter(Example3ParentPresenterImpl example3ParentPresenterImpl);
}
