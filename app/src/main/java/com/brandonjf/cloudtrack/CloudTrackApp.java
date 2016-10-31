package com.brandonjf.cloudtrack;

import android.app.Application;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * Created by brandon on 10/31/16.
 */

public class CloudTrackApp extends Application {
    public static final String TAG = CloudTrackApp.class.getName();
    public static CloudTrackApp mInstance;
    private Retrofit mRetrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public void setupRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }

    }
}
