package com.jshvarts.daggerandroidsampleapp.di;

import android.app.Fragment;
import android.app.FragmentManager;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * The module of the subclasses of the BaseFragment are required to include the BaseFragmentModule
 * and provide a concrete implementation of the Fragment named FRAGMENT
 */
@Module
public abstract class BaseFragmentModule {

    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    public static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    /**
     * If the parent and child fragment dependencies are not uniquely named, then the child fragment
     * and its dependencies will not know which Fragment is provided to it because both dependencies
     * have the same type of Fragment. It could be the parent fragment or the child fragment.
     * Hence the ambiguity, which causes a compile error of "android.app.Fragment is bound multiple times."
     */
    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(FRAGMENT) Fragment fragment) {
        /*
        The Fragment.getChildFragmentManager() method is only available beginning with API level 17.
        Supporting API levels below 17 down to 14 requires the use of AppCompatActivity, support Fragment,
        and dagger.android.support APIs.
         */
        return fragment.getChildFragmentManager();
    }
}
