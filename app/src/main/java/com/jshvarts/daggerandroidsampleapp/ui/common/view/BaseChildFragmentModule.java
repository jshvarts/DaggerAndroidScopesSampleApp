package com.jshvarts.daggerandroidsampleapp.ui.common.view;

/**
 * Created by shvartsy on 10/5/17.
 */

import android.app.Fragment;

import dagger.Module;

/**
 * Provides base fragment dependencies. This must be included in all child fragment modules, which
 * must provide a concrete implementation of the child {@link Fragment} and named
 * {@link #CHILD_FRAGMENT}.
 * <p>
 * Note that a different {@link javax.inject.Named} for the {@link Fragment} is required in order to
 * remove any ambiguity about which fragment is being provided in a child fragment. For example,
 * we have parent fragment P and child fragment C. Parent fragment P will provide the Fragment
 * reference using the {@link com.jshvarts.daggerandroidsampleapp.di.BaseFragmentModule#FRAGMENT} name. Child fragment C will provide the
 * Fragment reference using the {@link #CHILD_FRAGMENT} name.
 * <p>
 * If the parent and child fragments are not uniquely named, then the child fragment and its
 * dependencies will not know which Fragment is provided to it. It could be the parent fragment
 * or the child fragment. Hence the ambiguity, which causes a compile error of
 * "android.app.Fragment is bound multiple times".
 */
@Module
public abstract class BaseChildFragmentModule {
    /**
     * See class documentation regarding the need for this name.
     */
    public static final String CHILD_FRAGMENT = "BaseChildFragmentModule.childFragment";
}
