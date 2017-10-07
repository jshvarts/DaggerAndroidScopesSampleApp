package com.jshvarts.daggerandroidsampleapp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.main.view.MainFragment;
import com.jshvarts.daggerandroidsampleapp.ui.main.view.MainFragmentListener;

public class MainActivity extends BaseActivity implements MainFragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new MainFragment());
        }
    }

    @Override
    public void onExample1Clicked() {
        navigator.toExample1(this);
    }

    @Override
    public void onExample2Clicked() {
        navigator.toExample2(this);
    }

    @Override
    public void onExample3Clicked() {
        navigator.toExample3(this);
    }
}
