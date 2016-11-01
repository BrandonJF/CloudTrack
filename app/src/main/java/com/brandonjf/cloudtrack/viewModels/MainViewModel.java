package com.brandonjf.cloudtrack.viewModels;

import android.databinding.BaseObservable;

/**
 * Created by brandon on 10/31/16.
 */

public class MainViewModel extends BaseObservable {
    private boolean mLoggedIn;
    private final String statusString = "You are not logged in.";

    public String getStatusString() {
        return statusString;
    }

    public String getLoginLogInOutText() {
        return mLoggedIn ? "Log out" : "Log in";
    }
}
