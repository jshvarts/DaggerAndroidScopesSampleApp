package com.jshvarts.daggerandroidsampleapp.ui.common.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * A presenter that defines its own lifecycle methods.
 */
public interface Presenter {

    /**
     * Starts the presentation. This should be called in the view's (Activity or Fragment)
     * onCreate() or onViewStatedRestored() method respectively.
     *
     * @param savedInstanceState the saved instance state that contains state saved in
     *                           {@link #onSaveInstanceState(Bundle)}
     */
    void onStart(@Nullable Bundle savedInstanceState);

    /**
     * Resumes the presentation. This should be called in the view's (Activity or Fragment)
     * onResume() method.
     */
    void onResume();

    /**
     * Pauses the presentation. This should be called in the view's Activity or Fragment)
     * onPause() method.
     */
    void onPause();

    /**
     * Save the state of the presentation (if any). This should be called in the view's
     * (Activity or Fragment) onSaveInstanceState().
     *
     * @param outState the out state to save instance state
     */
    void onSaveInstanceState(Bundle outState);

    /**
     * Ends the presentation. This should be called in the view's (Activity or Fragment)
     * onDestroy() or onDestroyView() method respectively.
     */
    void onEnd();
}
