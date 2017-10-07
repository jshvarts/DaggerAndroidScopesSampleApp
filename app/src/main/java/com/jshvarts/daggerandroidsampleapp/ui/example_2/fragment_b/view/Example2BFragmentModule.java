package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.view;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.presenter.Example2BPresenterModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 2B fragment dependencies.
 */
@Module(includes = {
        BaseFragmentModule.class,
        Example2BPresenterModule.class
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

    @Binds
    @PerFragment
    abstract Example2BView example2BView(Example2BFragment example2BFragment);
}
