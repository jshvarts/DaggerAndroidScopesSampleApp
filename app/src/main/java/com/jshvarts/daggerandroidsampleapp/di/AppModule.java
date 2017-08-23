package com.jshvarts.daggerandroidsampleapp.di;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * This is where you will inject application-wide dependencies.
 */
/* Use AndroidSupportInjectionModule.class if you're using support library */
@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {
}
