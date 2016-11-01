package com.brandonjf.cloudtrack;

import android.app.Application;
import android.util.Log;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by brandon on 10/31/16.
 */

public class CloudTrackApp extends Application {
    public static final String TAG = CloudTrackApp.class.getName();
    public static CloudTrackApp mInstance;
    private Retrofit mRetrofit;
    private Properties mProperties;
    private final String SOUNDCLOUD_BASE_URL =  "https://api.soundcloud.com";

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        try {
            mProperties = loadProperties();
            Log.d(TAG, "The properties loaded, the key is: " + getProperties().getProperty("testKey"));
        } catch (IOException e) {
            Log.e(TAG, "Exception: ", e);
        }
        setupRetrofit();
    }

    public static CloudTrackApp getInstance() {
        return mInstance;
    }

    public Properties getProperties() {
        return mProperties;
    }

    private Properties loadProperties() throws IOException {
        if (mProperties == null) {
            mProperties = new Properties();
        }
        String[] fileList = {"stuff.properties"};
        Properties properties = new Properties();
        //We're not actually loading multiple prop files right now, but going to leave this here
        //for ease you'd add an array.
        String file = fileList[0];
        try {
            InputStream fileStream = getAssets().open(file);
            properties.load(fileStream);
            fileStream.close();
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Can't find the stuff.properties file. Please create and try again.");
        }
         return properties;
    }
    public void setupRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }

        mRetrofit = new Retrofit.Builder().baseUrl(SOUNDCLOUD_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}
