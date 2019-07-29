package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.di.scopes.ActivityScope;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class MyFragmentModule {

    @ActivityScope
    @Provides
    public MyFragment getFragment() {
        return new MyFragment();
    }
}
