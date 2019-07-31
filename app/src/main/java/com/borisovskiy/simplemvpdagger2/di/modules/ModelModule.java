package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.di.scopes.FragmentScope;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IModel;
import com.borisovskiy.simplemvpdagger2.mvp.Model;
import com.borisovskiy.simplemvpdagger2.retrofit.ApiBbc;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {

    @FragmentScope
    @Provides
    public static IModel getModel(ApiBbc apiBbc) {
        return new Model(apiBbc);
    }
}
