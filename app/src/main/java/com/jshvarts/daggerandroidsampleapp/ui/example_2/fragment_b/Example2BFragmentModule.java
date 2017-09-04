package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b;

import android.support.v4.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {
        BaseFragmentModule.class,
})

public abstract class Example2BFragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example2BFragment the example 2 B fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example2BFragment example2BFragment);
}
