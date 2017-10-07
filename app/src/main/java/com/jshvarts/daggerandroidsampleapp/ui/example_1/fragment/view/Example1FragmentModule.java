package com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.view;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.presenter.Example1PresenterModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.view.Example1Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 1 fragment dependencies.
 */
@Module(includes = {
        BaseFragmentModule.class,
        Example1PresenterModule.class
})
public abstract class Example1FragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link android.app.Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example1Fragment the example 1 fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example1Fragment example1Fragment);

    @Binds
    @PerFragment
    abstract Example1View example1View(Example1Fragment example1Fragment);
}