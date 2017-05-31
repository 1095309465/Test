package test.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view) {
        /*Globars.newInstance().getApiStores().loadDataByString("101190201").enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.body() == null) {
                } else {
                    Log.e("123","response="+response.body().toString());
                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                    Log.e("123","onFailure="+t.getMessage());

            }
        });*/
        Globars.newInstance().getApiStores().loadDataByBean("101190201").enqueue(new Callback<Jave>() {
            @Override
            public void onResponse(Call<Jave> call, Response<Jave> response) {
                if (response.body() != null) {
                    Log.e("123", "onResponse=" + response.body().toString());
                }

            }

            @Override
            public void onFailure(Call<Jave> call, Throwable t) {
                Log.e("123", "onFailure=" + t.getMessage());

            }
        });

    }
}
