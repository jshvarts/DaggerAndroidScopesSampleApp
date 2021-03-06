package com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseChildFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 3 child fragment dependencies.
 */
@Module(includes = {
        BaseChildFragmentModule.class,
})
abstract class Example3ChildFragmentModule {
    /**
     * As per the contract specified in {@link BaseChildFragmentModule}; "This must be included in
     * all child fragment modules, which must provide a concrete implementation of the child
     * {@link Fragment} and named {@link BaseChildFragmentModule#CHILD_FRAGMENT}..
     *
     * @param example3ChildFragment the example 3 child fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
    @PerChildFragment
    abstract Fragment fragment(Example3ChildFragment example3ChildFragment);
}
