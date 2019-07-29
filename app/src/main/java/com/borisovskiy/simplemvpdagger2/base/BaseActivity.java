package com.borisovskiy.simplemvpdagger2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.borisovskiy.simplemvpdagger2.R;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class BaseActivity extends AppCompatActivity  {

//    @Inject
//    DispatchingAndroidInjector<Fragment> fragmentInjector;
//    @Inject
//    MyFragment fragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.container, fragment)
//                .commit();
    }

//    @Override
//    public AndroidInjector<Fragment> supportFragmentInjector() {
//        return fragmentInjector;
//    }
}
