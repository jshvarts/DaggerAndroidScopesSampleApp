package com.jshvarts.daggerandroidsampleapp.ui.common.view;

import android.os.Bundle;
import android.support.annotation.CallSuper;

import com.jshvarts.daggerandroidsampleapp.ui.common.presenter.Presenter;

import javax.inject.Inject;

/**
 * Created by shvartsy on 10/5/17.
 */

public abstract class BaseViewFragment<T extends Presenter> extends BaseFragment
        implements MVPView {

    @Inject
    protected T presenter;

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        // Only start the presenter when the views have been bound.
        // See BaseFragment.onViewStateRestored
        presenter.onStart(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @CallSuper
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        presenter.onEnd();
        super.onDestroyView();
    }
}
