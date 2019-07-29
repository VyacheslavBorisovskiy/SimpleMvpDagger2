package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.ui.MainActivity;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module //(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {

    @ContributesAndroidInjector(modules = {MyFragmentModule.class})
    MainActivity contributesMainActivityInjector();

    @ContributesAndroidInjector(modules = {PresenterModule.class})
    MyFragment contributesMyFragmentActivityInjector();
}
