# DaggerAndroidScopesSampleApp

[![Build Status](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp.svg?branch=master)](https://travis-ci.org/jshvarts/DaggerAndroidScopesSampleApp)

Dagger 2.11 setup with **dagger-android** module demonstrating using custom scopes with ButterKnife.

## Branches

1. **master**

Uses regular Activity and Fragment classes with a minSdkVersion of 17. 

2. **[replace-Subcomponents-with-ContributesAndroidInjector](https://github.com/jshvarts/DaggerAndroidScopesSampleApp/tree/replace-Subcomponents-with-ContributesAndroidInjector)**

Based on master. Replaces `@Subcomponent`s with `@ContributesAndroidInjector`, new in Dagger 2.11.

3. **[use-support-library](https://github.com/jshvarts/DaggerAndroidScopesSampleApp/tree/use-support-library)**

Based on [replace-Subcomponents-with-ContributesAndroidInjector](https://github.com/jshvarts/DaggerAndroidScopesSampleApp/tree/replace-Subcomponents-with-ContributesAndroidInjector). Uses Android Support library to extend support from API 17 to 14.


*Note: This project is based on the excellent sample project https://github.com/vestrel00/android-dagger-butterknife-mvp*