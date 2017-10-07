package com.jshvarts.daggerandroidsampleapp.ui.common;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;

import com.jshvarts.daggerandroidsampleapp.di.PerActivity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * The module of the subclasses of the BaseActivity are required to include the BaseActivityModule
 * and provide a concrete implementation of the Activity
 */
@Module
public abstract class BaseActivityModule {
    public static final String ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager";

    @Binds
    @PerActivity
    abstract Context activityContext(Activity activity);

    @Provides
    @Named(ACTIVITY_FRAGMENT_MANAGER)
    @PerActivity
    static FragmentManager activityFragmentManager(Activity activity) {
        return activity.getFragmentManager();
    }
}
