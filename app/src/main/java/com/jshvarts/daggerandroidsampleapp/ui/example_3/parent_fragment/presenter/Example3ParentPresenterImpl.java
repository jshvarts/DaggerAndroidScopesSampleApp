package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.presenter;

import com.jshvarts.daggerandroidsampleapp.di.PerFragment;
import com.jshvarts.daggerandroidsampleapp.ui.common.presenter.BasePresenter;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.view.Example3ParentView;
import com.jshvarts.daggerandroidsampleapp.util.PerActivityUtil;
import com.jshvarts.daggerandroidsampleapp.util.PerFragmentUtil;
import com.jshvarts.daggerandroidsampleapp.util.SingletonUtil;

import javax.inject.Inject;

/**
 * An implementation of {@link Example3ParentPresenter}.
 */
@PerFragment
final class Example3ParentPresenterImpl extends BasePresenter<Example3ParentView>
        implements Example3ParentPresenter {

    private final SingletonUtil singletonUtil;
    private final PerActivityUtil perActivityUtil;
    private final PerFragmentUtil perFragmentUtil;

    @Inject
    Example3ParentPresenterImpl(Example3ParentView view, SingletonUtil singletonUtil,
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
