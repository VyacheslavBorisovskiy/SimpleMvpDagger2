package com.borisovskiy.simplemvpdagger2.mvp;

import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

public interface Contract {

    interface IPresenter{
        void onAttachUI();
        void onDetachUI();
//        PojoNews getPojoNews();
        void loadData();
    }

    interface IView{
        void setData(String string);
        void setData(PojoNews pojoNews);
        void handleError(Throwable t);
    }

    interface IModel{
        String getData();
//        PojoNews getPojoNews();
    }
}
