package com.jshvarts.daggerandroidsampleapp.di;

import com.jshvarts.daggerandroidsampleapp.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
