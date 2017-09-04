package com.jshvarts.daggerandroidsampleapp.ui.example_2;

import android.support.v7.app.AppCompatActivity;

import com.jshvarts.daggerandroidsampleapp.di.BaseActivityModule;
import com.jshvarts.daggerandroidsampleapp.di.PerActivity;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragmentModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.Example2BFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.Example2BFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides example 2 activity dependencies.
 */
@Module(includes = BaseActivityModule.class)
public abstract class Example2ActivityModule {

    /**
     * Provides the injector for the {@link Example2AFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example2AFragmentModule.class)
    abstract Example2AFragment example2AFragmentInjector();

    /**
     * Provides the injector for the {@link Example2BFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = Example2BFragmentModule.class)
    abstract Example2BFragment example2BFragmentInjector();

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must rovide a concrete implementation of {@link AppCompatActivity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * {@link com.jshvarts.daggerandroidsampleapp.ui.BaseActivity}.
     *
     * @param example2Activity the example 2 activity
     * @return the appCompatActivity
     */
    @Binds
    @PerActivity
    abstract AppCompatActivity appCompatActivity(Example2Activity example2Activity);
}
