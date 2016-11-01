package com.brandonjf.cloudtrack.data;

import com.brandonjf.cloudtrack.model.UserResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by brandon on 10/31/16.
 */

public interface SoundCloudApiInterface {
    @GET("user/{username}")
    Observable<UserResponse> getUser(@Path("username") String username);

}
