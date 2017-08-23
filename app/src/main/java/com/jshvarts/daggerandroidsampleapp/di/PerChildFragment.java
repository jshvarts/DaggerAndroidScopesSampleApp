package com.jshvarts.daggerandroidsampleapp.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Used to annotate dependencies that behave like a singleton within the lifespan of a
 * child Fragment instead of the entire Application, Activity or a parent Fragment.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerChildFragment {
}
