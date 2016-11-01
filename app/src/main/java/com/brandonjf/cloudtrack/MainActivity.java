package com.brandonjf.cloudtrack;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.brandonjf.cloudtrack.databinding.ActivityMainBinding;
import com.brandonjf.cloudtrack.viewmodel.MainViewModel;
import com.brandonjf.cloudtrack.viewmodel.MainViewModelContract;

public class MainActivity extends AppCompatActivity implements MainViewModelContract.View{

    private  String cliedId;
    private  String clientSecret;
    private MainViewModelContract.View view;

    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storeApiProperties();
        view = this;
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setViewModel(new MainViewModel(this, this));
        setupListeners();
    }


    public void setupListeners() {
        mBinding.loadDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoadDataClicked();
            }
        });
    }
    public void storeApiProperties() {
        cliedId = CloudTrackApp.getInstance().getProperties().getProperty("SOUNDCLOUD_ID");
        clientSecret = CloudTrackApp.getInstance().getProperties().getProperty("SOUNDCLOUD_SECRET");
    }

    @Override
    public Context getContext() {
        return this.getContext();
    }

    @Override
    public void onLoadDataClicked() {
        Toast.makeText(this,"LOADING DATA...",Toast.LENGTH_LONG).show();
    }
}
