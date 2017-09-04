package com.jshvarts.daggerandroidsampleapp.ui.example_2;

import android.app.Activity;
import android.app.Fragment;

import com.jshvarts.daggerandroidsampleapp.di.BaseActivityModule;
import com.jshvarts.daggerandroidsampleapp.di.PerActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragmentSubcomponent;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.Example2BFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.Example2BFragmentSubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(includes = BaseActivityModule.class,
        subcomponents = {
                Example2AFragmentSubcomponent.class,
                Example2BFragmentSubcomponent.class
        })
abstract class Example2ActivityModule {
    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example2AFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example2AFragmentInjectorFactory(Example2AFragmentSubcomponent.Builder builder);

    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @FragmentKey(Example2BFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    example2BFragmentInjectorFactory(Example2BFragmentSubcomponent.Builder builder);

    @Binds
    @PerActivity
    abstract Activity activity(Example2Activity example2Activity);
}
