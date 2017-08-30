package com.jshvarts.daggerandroidsampleapp.ui.main;

import com.jshvarts.daggerandroidsampleapp.di.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

// TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
@PerActivity
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}