package com.jshvarts.daggerandroidsampleapp.ui.example_2;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a.Example2AFragment;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_b.Example2BFragment;

public class Example2Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_2_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_a_container, new Example2AFragment());
            addFragment(R.id.fragment_b_container, new Example2BFragment());
        }
    }
}
