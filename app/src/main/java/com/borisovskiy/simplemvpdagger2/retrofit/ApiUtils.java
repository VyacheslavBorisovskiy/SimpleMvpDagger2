package com.borisovskiy.simplemvpdagger2.retrofit;



public class ApiUtils {


    // реализуем интерфейс Апи с помощью класса Ретрофит
    // ретрофит считает все аннотации и на основании аннотаций создаст методы

    public static ApiBbc getApiInterface (){
        return RetrofitClient.callRetrofit().create(ApiBbc.class);
    }
}
