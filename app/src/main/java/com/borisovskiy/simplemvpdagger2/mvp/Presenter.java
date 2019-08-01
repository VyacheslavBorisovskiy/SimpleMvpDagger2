package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.mvp.Contract.IModel;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IView;
import com.borisovskiy.simplemvpdagger2.retrofit.ApiBbc;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter implements Contract.IPresenter {

    private ApiBbc apiBbc;
    private IView view;
    private IModel model;

//    public Presenter(IView view, IModel model) {
//        this.view = view;
//        this.model = model;
//    }


    public Presenter(IView view, IModel model, ApiBbc apiBbc) {
        this.view = view;
        this.model = model;
        this.apiBbc = apiBbc;
    }

    @Override
    public void onAttachUI() {
        view.setData(model.getData());
//        view.setData(getPojoNews());

    }

    @Override
    public void onDetachUI() {
        view = null;
    }

//    @Override
//    public PojoNews getPojoNews() {
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!    model." + model);
//        return model.getPojoNews();
//    }

    @Override
    public void loadData() {
        apiBbc.getBbcData("bbc-news", "1ab09308782244538982ed1870f37d82").enqueue(new Callback<PojoNews>() {
            @Override
            public void onResponse(Call<PojoNews> call, Response<PojoNews> response) {
                view.setData(response.body());
            }

            @Override
            public void onFailure(Call<PojoNews> call, Throwable t) {
                view.handleError(t);
            }
        });
    }


}
