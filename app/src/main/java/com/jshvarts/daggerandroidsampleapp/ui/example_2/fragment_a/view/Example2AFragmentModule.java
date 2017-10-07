package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.view;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragmentModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.view.Example2AFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.presenter.Example2APresenterModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.view.Example2AView;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 2 A fragment dependencies.
 */
@Module(includes = {
        BaseFragmentModule.class,
        Example2APresenterModule.class
})
public abstract class Example2AFragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example2AFragment the example 2 A fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example2AFragment example2AFragment);

    @Binds
    @PerFragment
    abstract Example2AView example2AView(Example2AFragment example2AFragment);
}
