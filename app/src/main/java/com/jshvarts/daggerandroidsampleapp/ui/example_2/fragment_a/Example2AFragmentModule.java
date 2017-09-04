package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {
        BaseFragmentModule.class,
})

abstract class Example2AFragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link android.app.Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example2AFragment the example 2 A fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example2AFragment example2AFragment);
}
