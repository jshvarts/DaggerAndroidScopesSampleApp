package com.jshvarts.daggerandroidsampleapp.ui.main;

import android.support.v7.app.AppCompatActivity;

import com.jshvarts.daggerandroidsampleapp.di.BaseActivityModule;
import com.jshvarts.daggerandroidsampleapp.di.PerActivity;
import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides main activity dependencies.
 */
@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    /**
     * Provides the injector for the {@link MainFragment}, which has access to the dependencies
     * provided by this activity and application instance (singleton scoped objects).
     */
    @PerFragment
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must rovide a concrete implementation of {@link AppCompatActivity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * {@link com.jshvarts.daggerandroidsampleapp.ui.BaseActivity}.
     *
     * @param mainActivity the activity
     * @return the activity
     */
    @Binds
    @PerActivity
    abstract AppCompatActivity appCompatActivity(MainActivity mainActivity);

    /**
     * The main activity listens to the events in the {@link MainFragment}.
     *
     * @param mainActivity the activity
     * @return the main fragment listener
     */
    @Binds
    @PerActivity
    abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);
}
