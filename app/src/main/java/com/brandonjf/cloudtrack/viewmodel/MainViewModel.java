package com.brandonjf.cloudtrack.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;

import com.brandonjf.cloudtrack.CloudTrackApp;
import com.brandonjf.cloudtrack.data.SoundCloudApiInterface;
import com.brandonjf.cloudtrack.model.UserResponse;

/**
 * Created by brandon on 10/31/16.
 */

public class MainViewModel extends BaseObservable implements MainViewModelContract.ViewModel{
    private boolean mDataLoaded;
    private final String statusString = "Load Data";
    private Context mContext;
    private SoundCloudApiInterface mApi;
    private UserResponse mUser;
    private MainViewModelContract.View mView;

    public MainViewModel(Context context, MainViewModelContract.View view) {
        mContext = context;
        mView = view;
        mApi = CloudTrackApp.getInstance().getRetrofit().create(SoundCloudApiInterface.class);
        getUserInfo("brandonjf");
    }

    public void setUser(UserResponse user) {
        mUser = user;
    }

    public String getStatusString() {
        return statusString;
    }

    public String getLoadButtonText() {
        return mDataLoaded ? "Clear" : "Load Data";
    }

    private void getUserInfo(String username) {
        mApi.getUser(username);
    }

    public String getUsername() {
        return mUser.getUsername();
    }

    public void onLoadDataClicked() {
        mView.onLoadDataClicked();
    }

    @Override
    public void destroy() {
        mContext = null;
        mView = null;
    }


}
