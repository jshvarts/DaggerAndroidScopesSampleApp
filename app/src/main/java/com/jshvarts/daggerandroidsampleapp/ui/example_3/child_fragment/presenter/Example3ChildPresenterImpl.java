package com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerChildFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.presenter.BasePresenter;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.view.Example3ChildView;
import com.jshvarts.daggerandroidsampleapp.util.PerActivityUtil;
import com.jshvarts.daggerandroidsampleapp.util.PerChildFragmentUtil;
import com.jshvarts.daggerandroidsampleapp.util.PerFragmentUtil;
import com.jshvarts.daggerandroidsampleapp.util.SingletonUtil;

import javax.inject.Inject;

/**
 * An implementation of {@link Example3ChildPresenter}.
 */
@PerChildFragment
final class Example3ChildPresenterImpl extends BasePresenter<Example3ChildView>
        implements Example3ChildPresenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;
    private final PerChildFragmentUtil perChildFragmentUtil;

    @Inject
    Example3ChildPresenterImpl(Example3ChildView view, SingletonUtil singletonUtil,
                               PerActivityUtil perActivityUtil, PerFragmentUtil perFragmentUtil,
                               PerChildFragmentUtil perChildFragmentUtil) {
        super(view);
        this.singletonUtil = singletonUtil;
        this.perActivityUtil = perActivityUtil;
        this.perFragmentUtil = perFragmentUtil;
        this.perChildFragmentUtil = perChildFragmentUtil;
    }

    @Override
    public void onDoSomething() {
        // Do something here. Maybe make an asynchronous call to fetch data...
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        something += "\n" + perChildFragmentUtil.doSomething();
        view.showSomething(something);
    }
}
