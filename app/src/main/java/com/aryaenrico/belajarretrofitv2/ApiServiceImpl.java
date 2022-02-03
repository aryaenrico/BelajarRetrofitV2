package com.aryaenrico.belajarretrofitv2;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServiceImpl implements ApiService {
    // inisialisasi base url yang akan di gunakan
    private final String base_url ="https://demo.lazday.com/rest-api-sample/";

    // membuat kelas retrofit
    private Retrofit retrofit;

    // override method
    @Override
    public Call<DataModel> ambildata() {
        ApiService apiService =build();
        return  apiService.ambildata();

    }
    // digunakan untuk me-set retrofit
    // dan membuil Interface ApiService
    public ApiService build(){
        retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
          return retrofit.create(ApiService.class);
    }
}
