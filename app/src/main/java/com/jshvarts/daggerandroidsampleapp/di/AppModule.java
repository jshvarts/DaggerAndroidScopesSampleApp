package com.jshvarts.daggerandroidsampleapp.di;

import com.jshvarts.daggerandroidsampleapp.ui.example_1.Example1Activity;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.Example1ActivityModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.Example2Activity;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.Example2ActivityModule;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.Example3Activity;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.Example3ActivityModule;
import com.jshvarts.daggerandroidsampleapp.ui.main.MainActivity;
import com.jshvarts.daggerandroidsampleapp.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * This is where you will inject application-wide dependencies.
 */
/* AndroidSupportInjectionModule includes AndroidInjectionModule implicitly. */
@Module(includes = AndroidSupportInjectionModule.class)
abstract class AppModule {

    /**
     * Provides the injector for the {@link MainActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

    /**
     * Provides the injector for the {@link Example1Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example1ActivityModule.class)
    abstract Example1Activity example1ActivityInjector();

    /**
     * Provides the injector for the {@link Example2Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example2ActivityModule.class)
    abstract Example2Activity example2ActivityInjector();

    /**
     * Provides the injector for the {@link Example3Activity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = Example3ActivityModule.class)
    abstract Example3Activity example3ActivityInjector();
}
