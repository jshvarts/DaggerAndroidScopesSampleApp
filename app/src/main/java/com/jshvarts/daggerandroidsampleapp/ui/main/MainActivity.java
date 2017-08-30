package com.jshvarts.daggerandroidsampleapp.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.BaseActivity;
import com.jshvarts.daggerandroidsampleapp.ui.example_1.Example1Activity;

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
        Intent intent = new Intent(this, Example1Activity.class);
        startActivity(intent);
    }

    @Override
    public void onExample2Clicked() {
        // TODO start example 2 activity
        Toast.makeText(this, "Launch example 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onExample3Clicked() {
        // TODO start example 3 activity
        Toast.makeText(this, "Launch example 3", Toast.LENGTH_SHORT).show();
    }
}
