package com.aryaenrico.belajarretrofitv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    // membuat String tag
    public static final String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // memanggil method get data
        get_data();
    }

    // method untuk mengambil data menggunakan api
    public void get_data(){
        ApiServiceImpl data = new ApiServiceImpl();
       data.ambildata().enqueue(new Callback<DataModel>() {
           @Override
           public void onResponse(Call<DataModel> call, Response<DataModel> response) {
               // jika get data berhasil instruksi di bawah akan di kerjakan
               if(response.isSuccessful()){
                   List<DataModel.Result> result = response.body().getResult();
                   Log.d(tag,result.toString());
               }
           }

           @Override
           public void onFailure(Call<DataModel> call, Throwable t) {

           }
       });

    }

}