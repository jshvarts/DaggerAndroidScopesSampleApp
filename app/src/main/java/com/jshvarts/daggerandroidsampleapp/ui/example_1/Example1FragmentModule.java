package com.jshvarts.daggerandroidsampleapp.ui.example_1;

import android.support.v4.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 1 fragment dependencies.
 */
@Module(includes = {
        BaseFragmentModule.class,
})
public abstract class Example1FragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example1Fragment the example 1 fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example1Fragment example1Fragment);
}