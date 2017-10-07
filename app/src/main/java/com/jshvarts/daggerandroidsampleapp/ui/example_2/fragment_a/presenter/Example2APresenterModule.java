package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 2 A presenter dependencies.
 */
@Module
public abstract class Example2APresenterModule {
    @Binds
    @PerFragment
    abstract Example2APresenter example2APresenter(Example2APresenterImpl example2APresenterImpl);
}
