package com.borisovskiy.simplemvpdagger2.ui;

import android.os.Bundle;

import com.borisovskiy.simplemvpdagger2.R;
import com.borisovskiy.simplemvpdagger2.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MyFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit();
    }
}
