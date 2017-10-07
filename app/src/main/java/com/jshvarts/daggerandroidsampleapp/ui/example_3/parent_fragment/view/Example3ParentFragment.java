package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseViewFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.child_fragment.view.Example3ChildFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.presenter.Example3ParentPresenter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A fragment implementation of {@link Example3ParentView}.
 */
public final class Example3ParentFragment extends BaseViewFragment<Example3ParentPresenter>
        implements Example3ParentView {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_3_parent_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            addChildFragment(R.id.child_fragment_container, new Example3ChildFragment());
        }
    }

    @Override
    public void showSomething(String something) {
        someText.setText(something);
    }

    @OnClick(R.id.do_something)
    void onDoSomethingClicked() {
        presenter.onDoSomething();
    }
}