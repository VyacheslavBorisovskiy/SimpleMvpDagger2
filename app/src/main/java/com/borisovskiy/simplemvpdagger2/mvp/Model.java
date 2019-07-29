package com.borisovskiy.simplemvpdagger2.mvp;

import javax.inject.Inject;

public class Model implements Contract.IModel {

    private String s = "mvp-dagger";

    @Inject
    public Model() {
    }

    @Override
    public String getData() {
        return s;
    }
}
