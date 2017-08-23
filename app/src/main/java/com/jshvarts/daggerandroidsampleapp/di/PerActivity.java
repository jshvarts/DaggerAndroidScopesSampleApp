package com.jshvarts.daggerandroidsampleapp.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Used to annotate dependencies that behave like a singleton within the lifespan of an Activity,
 * Fragment, and child Fragments instead of the entire Application.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
