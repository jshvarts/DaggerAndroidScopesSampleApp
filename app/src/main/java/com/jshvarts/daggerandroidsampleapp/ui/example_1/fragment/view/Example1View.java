package com.jshvarts.daggerandroidsampleapp.ui.example_1.fragment.view;

import com.jshvarts.daggerandroidsampleapp.ui.common.view.MVPView;

/**
 * A view that contains a button that does something.
 */
public interface Example1View extends MVPView {

    void showSomething(String something);
}