package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment;

import android.support.v4.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.Example3ChildFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.Example3ChildFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides example 3 parent fragment dependencies.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class Example3ParentFragmentModule {

    /**
     * Provides the injector for the {@link Example3ChildFragment}, which has access to the
     * dependencies provided by this fragment and activity and application instance
     * (singleton scoped objects).
     */
    @PerChildFragment
    @ContributesAndroidInjector(modules = Example3ChildFragmentModule.class)
    abstract Example3ChildFragment example3ChildFragmentInjector();

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example3ParentFragment the example 3 parent fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example3ParentFragment example3ParentFragment);
}
