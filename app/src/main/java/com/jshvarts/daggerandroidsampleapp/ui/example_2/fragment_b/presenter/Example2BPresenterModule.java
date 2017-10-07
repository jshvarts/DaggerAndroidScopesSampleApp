package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 2 B presenter dependencies.
 */
@Module
public abstract class Example2BPresenterModule {

    @Binds
    @PerFragment
    abstract Example2BPresenter example2BPresenter(Example2BPresenterImpl example2BPresenterImpl);
}
