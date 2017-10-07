package com.jshvarts.daggerandroidsampleapp.ui.main.view;

import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides main fragment dependencies.
 */
@Module(includes = BaseFragmentModule.class)
public abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(MainFragment mainFragment);
}
