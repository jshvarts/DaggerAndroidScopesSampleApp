# DaggerAndroidScopesSampleApp

[![Build Status](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp.svg?branch=master)](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp)

Dagger 2.11 setup with dagger-android module demonstrating using scopes (`@Singleton`, `@PerActivity`, `@PerFragment` and `@PerChildFragment`) with `@ContributesAndroidInjector` which is different from master branch.

## @ContributesAndroidInjector
Dagger 2.11 has provided us with the `@ContributesAndroidInjector` so that we can delete all subcomponent classes.

### Migrating to @ContributesAndroidInjector
Migrating to @ContributesAndroidInjector is done in 3 easy steps:

1. Replace AndroidInjector.Factory usages in all modules with `@ContributesAndroidInjector`.
2. Delete all subcomponent inclusions in every module.
3. Delete all classes annotated with `@Subcomponent`.





