package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.presenter.BasePresenter;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.view.Example2BView;
import com.jshvarts.daggerandroidsampleapp.util.PerActivityUtil;
import com.jshvarts.daggerandroidsampleapp.util.PerFragmentUtil;
import com.jshvarts.daggerandroidsampleapp.util.SingletonUtil;

import javax.inject.Inject;

/**
 * An implementation of {@link Example2BPresenter}.
 */
@PerFragment
final class Example2BPresenterImpl extends BasePresenter<Example2BView>
        implements Example2BPresenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;

    @Inject
    Example2BPresenterImpl(Example2BView view, SingletonUtil singletonUtil,
                           PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil) {
        super(view);
        this.singletonUtil = singletonUtil;
        this.perActivityUtil = perActivityUtil;
        this.perFragmentUtil = perFragmentUtil;
    }

    @Override
    public void onDoSomething() {
        // Do something here. Maybe make an asynchronous call to fetch data...
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        view.showSomething(something);
    }
}
