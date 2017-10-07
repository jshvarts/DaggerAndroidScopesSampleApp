package com.jshvarts.daggerandroidsampleapp.ui.example_3.parent_fragment.view;

import com.jshvarts.daggerandroidsampleapp.ui.common.view.MVPView;

/**
 * A view that contains a button that does something.
 */
public interface Example3ParentView extends MVPView {

    void showSomething(String something);
}
