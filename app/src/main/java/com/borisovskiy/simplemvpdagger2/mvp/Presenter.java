package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.mvp.Contract.IModel;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IView;

import javax.inject.Inject;

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
    }

    @Override
    public void onDetachUI() {
        view = null;
    }
}
