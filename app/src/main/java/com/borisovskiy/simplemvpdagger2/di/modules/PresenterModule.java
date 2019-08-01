package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.mvp.Contract;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IPresenter;
import com.borisovskiy.simplemvpdagger2.mvp.Model;
import com.borisovskiy.simplemvpdagger2.mvp.Presenter;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import dagger.Binds;
import dagger.Module;

@Module
public interface PresenterModule {

//    @FragmentScope
//    @Provides
//    static IPresenter getPresenter(Contract.IView iView, Model model, ApiBbc apiBbc) {
//        return new Presenter(iView, model, apiBbc);
//    }


    @Binds
    IPresenter getIPresenter(Presenter presenter);

    @Binds
    Contract.IView getIView(MyFragment myFragment);

    @Binds
    Contract.IModel getIModel(Model model);


}
