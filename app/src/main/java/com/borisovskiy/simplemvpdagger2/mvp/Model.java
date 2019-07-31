package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.retrofit.ApiBbc;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Model implements Contract.IModel {

//    @Inject
    ApiBbc api;
    private String s = "mvp-dagger";
    private PojoNews pojoNews;

//    @Inject
    public Model(ApiBbc api) {
        this.api = api;
    }

    @Override
    public String getData() {
        return s;
    }

    public PojoNews getPojoNews() {
        api.getBbcData("bbc-news", "1ab09308782244538982ed1870f37d82").enqueue(new Callback<PojoNews>() {
            @Override
            public void onResponse(Call<PojoNews> call, Response<PojoNews> response) {
                pojoNews = response.body();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!! " + pojoNews);
            }

            @Override
            public void onFailure(Call<PojoNews> call, Throwable t) {

            }
        });
        return pojoNews;
    }
}
