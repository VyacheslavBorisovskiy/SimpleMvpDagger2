package com.borisovskiy.simplemvpdagger2.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiBbc {

        @GET("top-headlines")
        Call<PojoNews> getBbcData(@Query("sources") String site, @Query("apiKey") String name);
    }
