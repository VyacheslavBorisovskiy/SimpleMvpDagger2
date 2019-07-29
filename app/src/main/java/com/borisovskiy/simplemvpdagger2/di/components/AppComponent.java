package com.borisovskiy.simplemvpdagger2.di.components;

import android.app.Application;

import com.borisovskiy.simplemvpdagger2.base.App;
import com.borisovskiy.simplemvpdagger2.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(App app);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
