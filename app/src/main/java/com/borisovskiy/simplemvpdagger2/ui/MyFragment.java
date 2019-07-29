package com.borisovskiy.simplemvpdagger2.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.borisovskiy.simplemvpdagger2.R;
import com.borisovskiy.simplemvpdagger2.base.BaseFragment;
import com.borisovskiy.simplemvpdagger2.mvp.Contract;
import com.borisovskiy.simplemvpdagger2.mvp.Model;
import com.borisovskiy.simplemvpdagger2.mvp.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyFragment extends BaseFragment implements Contract.IView {

    @BindView(R.id.textview)
    TextView textView;
    private Unbinder unbinder;
    private Presenter presenter;

    public MyFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        presenter = new Presenter(this, new Model());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.onAttachUI();
    }

    @Override
    public void setData(String string) {
        textView.setText(string);
    }

    @Override
    public void onStop() {
        presenter.onDetachUI();
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }
}