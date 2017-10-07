package com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseViewFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.presenter.Example3ChildPresenter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A fragment implementation of {@link Example3ChildView}.
 */
public final class Example3ChildFragment extends BaseViewFragment<Example3ChildPresenter>
        implements Example3ChildView {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_3_child_fragment, container, false);
    }

    @Override
    public void showSomething(String something) {
        childFragmentManager.hashCode();
        someText.setText(something);
    }

    @OnClick(R.id.do_something)
    void onDoSomethingClicked() {
        presenter.onDoSomething();
    }
}