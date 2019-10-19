package com.example.ebooking;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {

    @GET("event/search")
    Call<YelpEventSearchResponse> getEvents(
            @Query("location") String location,
            @Query("term") String term
    );
}