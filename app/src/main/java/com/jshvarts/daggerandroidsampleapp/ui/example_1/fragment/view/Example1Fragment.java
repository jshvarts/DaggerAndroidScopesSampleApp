package com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseViewFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.presenter.Example1Presenter;

import butterknife.BindView;
import butterknife.OnClick;

public final class Example1Fragment extends BaseViewFragment<Example1Presenter>
        implements Example1View {

    @BindView(R.id.some_text)
    TextView someText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_1_fragment, container, false);
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
