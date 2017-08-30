package com.jshvarts.daggerandroidsampleapp.di;

import android.app.Activity;

import com.jshvarts.daggerandroidsampleapp.ui.main.MainActivity;
import com.jshvarts.daggerandroidsampleapp.ui.main.MainActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * This is where you will inject application-wide dependencies.
 */
/* Use AndroidSupportInjectionModule.class if you're using support library */
@Module(includes = AndroidInjectionModule.class,
        subcomponents = MainActivitySubcomponent.class)
abstract class AppModule {
    // TODO (ContributesAndroidInjector) remove this in favor of @ContributesAndroidInjector
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    mainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
}
