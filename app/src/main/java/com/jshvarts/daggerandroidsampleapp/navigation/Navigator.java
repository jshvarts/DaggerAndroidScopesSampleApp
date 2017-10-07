package com.jshvarts.daggerandroidsampleapp.navigation;

import android.content.Context;
import android.content.Intent;

import com.jshvarts.daggerandroidsampleapp.ui.example_1.Example1Activity;
import com.jshvarts.daggerandroidsampleapp.ui.example_2.Example2Activity;
import com.jshvarts.daggerandroidsampleapp.ui.example_3.Example3Activity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Provides methods to navigate to the different activities in the application.
 */
@Singleton
public final class Navigator {
    @Inject
    Navigator() {
    }

    public void toExample1(Context context) {
        Intent intent = new Intent(context, Example1Activity.class);
        context.startActivity(intent);
    }

    public void toExample2(Context context) {
        Intent intent = new Intent(context, Example2Activity.class);
        context.startActivity(intent);
    }

    public void toExample3(Context context) {
        Intent intent = new Intent(context, Example3Activity.class);
        context.startActivity(intent);
    }
}
