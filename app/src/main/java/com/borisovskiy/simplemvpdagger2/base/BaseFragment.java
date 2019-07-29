package com.borisovskiy.simplemvpdagger2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
//        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
