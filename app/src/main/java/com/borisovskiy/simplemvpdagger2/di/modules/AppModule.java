package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.di.scopes.ActivityScope;
import com.borisovskiy.simplemvpdagger2.di.scopes.FragmentScope;
import com.borisovskiy.simplemvpdagger2.ui.MainActivity;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module //(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MyFragmentModule.class})
    MainActivity contributesMainActivityInjector();

    @FragmentScope
    @ContributesAndroidInjector(modules = {PresenterModule.class, ModelModule.class})
    MyFragment contributesPresenterInjector();
}
