package com.jshvarts.daggerandroidsampleapp.ui.example_3;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.Example3ParentFragment;

/**
 * Activity that contains a single fragment that contains a child fragment.
 */
public final class Example3Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_3_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.parent_fragment_container, new Example3ParentFragment());
        }
    }
}
