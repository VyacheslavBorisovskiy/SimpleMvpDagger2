package com.borisovskiy.simplemvpdagger2.mvp;

public class Model implements Contract.IModel {

    private String s = "mvp-dagger";

    @Override
    public String getData() {
        return s;
    }
}
