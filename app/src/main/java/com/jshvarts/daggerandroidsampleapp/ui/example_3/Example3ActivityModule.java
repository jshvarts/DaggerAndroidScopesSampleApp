package com.jshvarts.daggerandroidsampleapp.ui.example_3;

import android.app.Activity;
import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseActivityModule;
import com.jshvarts.daggerandroidsampleapp.di.PerActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.Example3ParentFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.Example3ParentFragmentSubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Provides example 3 activity dependencies.
 */
@Module(includes = BaseActivityModule.class,
        subcomponents = Example3ParentFragmentSubcomponent.class)
abstract class Example3ActivityModule {

    /**
     * Provides the injector for the {@link Example3ParentFragment}, which has access to the
     * dependencies provided by this activity and application instance (singleton scoped objects).
     */
    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example3ParentFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example3ParentFragmentInjectorFactory(Example3ParentFragmentSubcomponent.Builder builder);

    /**
     * As per the contract specified in {@link BaseActivityModule}; "This must be included in all
     * activity modules, which must rovide a concrete implementation of {@link Activity}."
     * <p>
     * This provides the activity required to inject the
     * {@link BaseActivityModule#ACTIVITY_FRAGMENT_MANAGER} into the
     * {@link com.jshvarts.daggerandroidsampleapp.ui.BaseActivity}.
     *
     * @param example3Activity the example 3 activity
     * @return the activity
     */
    @Binds
    @PerActivity
    abstract Activity activity(Example3Activity example3Activity);
}
