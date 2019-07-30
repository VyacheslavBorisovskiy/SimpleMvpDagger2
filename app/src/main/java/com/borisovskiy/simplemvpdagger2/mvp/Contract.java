package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

public interface Contract {

    interface IPresenter{
        void onAttachUI();
        void onDetachUI();
        PojoNews getPojoNews();
    }

    interface IView{
        void setData(String string);
        void setData(PojoNews pojoNews);
    }

    interface IModel{
        String getData();
        PojoNews getPojoNews();
    }
}
