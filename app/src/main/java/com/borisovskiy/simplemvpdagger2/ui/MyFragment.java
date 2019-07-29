package com.borisovskiy.simplemvpdagger2.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.borisovskiy.simplemvpdagger2.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyFragment extends Fragment {

    private Unbinder unbinder;

    public MyFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        return view;
    }

}
