package com.example.lab_work_smd_section_bscs_6c.RESTAPIExample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyRetroFit {
    public static Retrofit retrofit;
    public static String uRL = "https://jsonplaceholder.typicode.com/";
    public static Retrofit getMyRetrofit(){
        if (retrofit== null){
            retrofit= new Retrofit.Builder().baseUrl(uRL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
