package com.aryaenrico.belajarretrofitv2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    // get di gunakan untuk mendapatkan data
    // parameter merupakan endpoint yang akan dituju
    @GET("data.php")

    // membuat function dengan return call
    // dengan generic class data model
    // dengan nama ambildata
    Call<DataModel> ambildata();
}
