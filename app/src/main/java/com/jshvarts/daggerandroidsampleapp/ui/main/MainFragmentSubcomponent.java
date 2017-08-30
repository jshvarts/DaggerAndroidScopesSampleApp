package com.jshvarts.daggerandroidsampleapp.ui.main;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

// TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
@PerFragment
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment> {
    }
}