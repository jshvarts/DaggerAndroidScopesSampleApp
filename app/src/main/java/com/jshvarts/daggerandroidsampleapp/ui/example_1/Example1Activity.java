package com.jshvarts.daggerandroidsampleapp.ui.example_1;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.view.Example1Fragment;

public final class Example1Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_1_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new Example1Fragment());
        }
    }
}