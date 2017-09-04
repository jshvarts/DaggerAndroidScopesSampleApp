package com.jshvarts.daggerandroidsampleapp.ui.example_2.fragment_a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jshvarts.daggerandroidsampleapp.R;
import com.jshvarts.daggerandroidsampleapp.ui.BaseFragment;
import com.jshvarts.daggerandroidsampleapp.util.PerActivityUtil;
import com.jshvarts.daggerandroidsampleapp.util.PerFragmentUtil;
import com.jshvarts.daggerandroidsampleapp.util.SingletonUtil;

import javax.inject.Inject;

public class Example2AFragment extends BaseFragment implements View.OnClickListener {

    @Inject
    SingletonUtil singletonUtil;

    @Inject
    PerActivityUtil perActivityUtil;

    @Inject
    PerFragmentUtil perFragmentUtil;

    private TextView someText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.example_2_fragment_a, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // TODO (Butterknife) replace with butterknife view binding
        someText = (TextView) view.findViewById(R.id.some_text);
        view.findViewById(R.id.do_something).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.do_something:
                onDoSomethingClicked();
                break;
            default:
                throw new IllegalArgumentException("Unhandled view " + v.getId());
        }
    }

    private void onDoSomethingClicked() {
        String something = singletonUtil.doSomething();
        something += "\n" + perActivityUtil.doSomething();
        something += "\n" + perFragmentUtil.doSomething();
        showSomething(something);
    }

    private void showSomething(String something) {
        someText.setText(something);
    }
}