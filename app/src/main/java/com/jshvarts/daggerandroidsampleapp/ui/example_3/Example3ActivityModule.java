package com.jshvarts.daggerandroidsampleapp.ui.example_3;

import android.app.Activity;

import com.jshvarts.daggerandroidsampleapp.di.BaseActivityModule;
import com.jshvarts.daggerandroidsampleapp.di.PerActivity;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.view.Example3ParentFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.view.Example3ParentFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides example 3 activity dependencies.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example3ActivityModule {

    /**
     * Provides the injector for the {@link Example3ParentFragment}, which has access to the
     * dependencies provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example3ParentFragmentModule.class)
    abstract Example3ParentFragment example3ParentFragmentInjector();

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must rovide a concrete implementation of {@link Activity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * {@link BaseActivity}.
     *
     * @param example3Activity the example 3 activity
     * @return the activity
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example3Activity example3Activity);
}