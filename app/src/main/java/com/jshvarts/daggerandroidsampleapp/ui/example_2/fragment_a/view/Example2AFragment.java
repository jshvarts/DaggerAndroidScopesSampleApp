package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseViewFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.presenter.Example2APresenter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A fragment implementation of {@link Example2AView}.
 */
public final class Example2AFragment extends BaseViewFragment<Example2APresenter> implements Example2AView {

    @BindView(R.id.some_text)
    TextView someText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_2_fragment_a, container, false);
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
