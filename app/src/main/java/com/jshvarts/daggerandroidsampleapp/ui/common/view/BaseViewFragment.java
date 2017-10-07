package com.jshvarts.daggerandroidsampleapp.ui.common.view;

import android.os.Bundle;
import android.support.annotation.CallSuper;

import com.jshvarts.daggerandroidsampleapp.ui.common.presenter.Presenter;

import javax.inject.Inject;

/**
 * A {@link BaseFragment} that contains and invokes {@link Presenter} lifecycle invocations.
 *
 * The BaseViewFragment is a subclass of our view.BaseFragment and implements the MVPView interface.
 * It contains a type T that extends a Presenter. The T presenter is injected here so that its lifecycle methods can be invoked.
 * This gives subclasses the T presenter for free and not have to worry about invoking the Presenter’s lifecycle methods.
 *
 * Question: Why are there 2 different base fragment classes; BaseFragment and BaseViewFragment?
 * Why not just combine them into 1 base class?
 *
 * Some Fragments, such as our MainFragment, do not contain any logic to warrant a need for a Presenter.
 * Logic-free Fragments extend the BaseFragment since they do not need to have a Presenter-View pair.
 * For Fragments that do have logic and need a Presenter to host said logic, the BaseViewFragment is used.
 *
 * @param <T> the type of the {@link Presenter}.
 */
public abstract class BaseViewFragment<T extends Presenter> extends BaseFragment
        implements MVPView {

    @Inject
    protected T presenter;

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        // Only start the presenter when the views have been bound before the presentation begins.
        // This ensures that no NullPointerException occurs if the Presenter calls an MVPView method that uses a bound view.
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
