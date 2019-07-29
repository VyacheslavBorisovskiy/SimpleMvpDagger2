package com.borisovskiy.simplemvpdagger2.mvp;

public interface Contract {

    interface IPresenter{
        void onAttachUI();
        void onDetachUI();
    }

    interface IView{
        void setData(String string);
    }

    interface IModel{
        String getData();
    }
}
