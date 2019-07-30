package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.retrofit.ApiBbc;
import com.borisovskiy.simplemvpdagger2.retrofit.RetrofitClient;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

    public static final String BASE_URL = "https://newsapi.org/v2/";
    public static Retrofit retrofit = null;

    @Provides
    ApiBbc getApi(Retrofit retrofit) {
        return retrofit.create(ApiBbc.class);
    }

    @Provides
    Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
//                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
