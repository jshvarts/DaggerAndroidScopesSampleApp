package com.jshvarts.daggerandroidsampleapp.ui.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.common.view.BaseFragment;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Displays a set of buttons for the other activities.
 * <p>
 * <b>NOTE</b>
 * This fragment does not implement a view and host a presenter because there is no logic that
 * is done here. This fragment simply notifies the host Activity of the button click events that
 * occur.
 * <p>
 * With that said, this does not implement and MVPView interface nor does it extend
 * BaseViewFragment.
 * <p>
 * So why not just put the layout of this fragment into the Activity itself? We could do that but
 * we would lose the ability to reuse this fragment along with other fragments in different
 * activities if we wanted to (not that we would).
 * <p>
 * The activity only acts as the host to 1 or more fragments for inter-fragment communication. All
 * views and logic are in fragments.
 */
public final class MainFragment extends BaseFragment {

    @Inject
    MainFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @OnClick(R.id.example_1)
    void onExample1Clicked() {
        listener.onExample1Clicked();
    }

    @OnClick(R.id.example_2)
    void onExample2Clicked() {
        listener.onExample2Clicked();
    }

    @OnClick(R.id.example_3)
    void onExample3Clicked() {
        listener.onExample3Clicked();
    }
}
