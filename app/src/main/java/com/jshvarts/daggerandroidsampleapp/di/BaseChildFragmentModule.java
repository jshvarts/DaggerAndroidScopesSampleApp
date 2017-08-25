package com.jshvarts.daggerandroidsampleapp.di;

import dagger.Module;

/**
 * The module of the subclasses of the BaseChildFragment are required to include the
 * BaseChildFragmentModule and provide a concrete implementation of the Fragment named CHILD_FRAGMENT.
 */
@Module
public class BaseChildFragmentModule {

    public static final String CHILD_FRAGMENT = "BaseChildFragmentModule.childFragment";

}

