package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {

    @ContributesAndroidInjector
    MainActivity contributesMainActivityInjector();
}
