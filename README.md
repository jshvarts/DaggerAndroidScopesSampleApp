# DaggerAndroidScopesSampleApp

[![Build Status](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp.svg?branch=use-support-library)](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp)

## Branches

**master**

Uses regular `Activity` and `Fragment` classes with a minSdkVersion of 17.

**use-support-library**

Uses `AppCompatActivity` and support `Fragment` classes with a minSdkVersion of 14.
Why is the minSdkVersion of the non-support setup in master 17? Can it be lower?

There are 2 main reasons why the minSdkVersion of the non-support setup can only as low as 17.

1. Fragment.getChildFragmentManager() is available since API 17. This is one of the reasons why the non-support setup in the master branch uses minSdkVersion of 17 and not lower.
   
   use-support-library supports API levels below 17 down to 14.
   
2. Fragment.onViewStateRestored(Bundle) is available since API 17. This is one of the reasons why the non-support setup in the master branch uses minSdkVersion of 17 and not lower.
   
   use-support-library supports API levels below 17 down to 14.
   
Thus, the lowest minSdkVersion supported for the non-support setup in master is 17.
It cannot be lower.

What about the minSdkVersion of the support setup in use-support-library? Can it be lower than 14?

No. **The dagger.android.support API only supports minSdkVersion as low as 14.**

## Changes

1. Added google maven repository
2. Added android.dagger.support to dependencies
3. Set minSdkVersion from 17 to 14
4. Set Application theme to `Theme.AppCompat`
5. Including `AndroidSupportInjectionModule` instead of `AndroidInjectionModule` in AppModule includes
6. BaseActivity and module now using `AppCompatActivity`
7. BaseFragment and module now using `android.support.v4.app.Fragment`
8. BaseFragment now injecting with `AndroidSupportInjection.inject(this)` in only `onAttach(Context)`
9. Replaced all occurrences of HasFragmentInjector with `HasSupportFragmentInjector`
10. Replaced all occurrences of android.app.Fragment with `android.support.v4.app.Fragment`
11. Replaced all occurrences of android.app.FragmentManager with `android.support.v4.app.FragmentManager`

For more details, see this PR: https://github.com/vestrel00/android-dagger-butterknife-mvp/pull/49





