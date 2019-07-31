package com.borisovskiy.simplemvpdagger2.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.borisovskiy.simplemvpdagger2.R;
import com.borisovskiy.simplemvpdagger2.adapters.RecyclerViewAdapter;
import com.borisovskiy.simplemvpdagger2.base.BaseFragment;
import com.borisovskiy.simplemvpdagger2.mvp.Contract;
import com.borisovskiy.simplemvpdagger2.mvp.Contract.IPresenter;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyFragment extends BaseFragment implements Contract.IView {
    //    @Inject
//    ApiBbc apiBbc;
    //    Retrofit retrofit;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    RecyclerViewAdapter recyclerViewAdapter;
    @BindView(R.id.textview)
    TextView textView;
    @Inject
    IPresenter presenter;
    private Unbinder unbinder;

    public MyFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        unbinder = ButterKnife.bind(this, view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewAdapter = new RecyclerViewAdapter(getContext());
        recyclerView.setAdapter(recyclerViewAdapter);

//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();

//        retrofit = RetrofitClient.callRetrofit();
//        apiBbc = retrofit.create(ApiBbc.class);


//        apiBbc.getBbcData("bbc-news", "1ab09308782244538982ed1870f37d82").enqueue(new Callback<PojoNews>() {
//            @Override
//            public void onResponse(Call<PojoNews> call, Response<PojoNews> response) {
//                handleResults(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<PojoNews> call, Throwable t) {
//                handleError(t);
//            }
//        });

//        handleResults(presenter.getPojoNews());
        presenter.loadData();

        return view;
    }

    public void handleResults(PojoNews pojoNews) {
        if (pojoNews != null) {
            recyclerViewAdapter.setData(pojoNews);
            System.out.println(pojoNews + " _____________________________________________________________");

        } else {
            Toast.makeText(getContext(), "NO RESULTS FOUND", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void handleError(Throwable t) {
        System.out.println(t + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
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
    public void setData(PojoNews pojoNews) {
        if (pojoNews != null) {
            recyclerViewAdapter.setData(pojoNews);
            System.out.println(pojoNews + " _____________________________________________________________");

        } else {
            Toast.makeText(getContext(), "NO RESULTS FOUND", Toast.LENGTH_LONG).show();
        }
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