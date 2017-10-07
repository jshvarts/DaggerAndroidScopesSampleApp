package com.jshvarts.daggerandroidsampleapp.ui.common.view;

import android.app.Fragment;
import android.app.FragmentManager;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Provides base fragment dependencies. This must be included in all fragment modules, which must
 * provide a concrete implementation of {@link Fragment} and named {@link #FRAGMENT}.
 */
@Module
public abstract class BaseFragmentModule {

    /**
     * See {@link BaseChildFragmentModule} class documentation regarding the need for this name.
     */
    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(FRAGMENT) Fragment fragment) {
        return fragment.getChildFragmentManager();
    }
}