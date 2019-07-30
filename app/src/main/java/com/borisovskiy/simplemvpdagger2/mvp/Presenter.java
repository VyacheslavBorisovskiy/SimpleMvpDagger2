package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.mvp.Contract.IModel;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IView;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

public class Presenter implements Contract.IPresenter {

    private IView view;
    private IModel model;


    public Presenter(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void onAttachUI() {
        view.setData(model.getData());
//        view.setData(model.getPojoNews());
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!    model." + model.getPojoNews());
    }

    @Override
    public void onDetachUI() {
        view = null;
    }

    @Override
    public PojoNews getPojoNews() {

        return model.getPojoNews();
    }


}
