package test.test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by DELL on 2017/5/31.
 */

public interface ApiStores {
    //baseUrl
    String API_SERVER_URL = "http://www.weather.com.cn/";

    //返回字符串
    @GET("adat/sk/{cityId}.html")
    Call<String> loadDataByString(@Path("cityId") String cityIdString);

    //返回字符串
    @GET("adat/sk/{cityId}.html")
    Call<Jave> loadDataByBean(@Path("cityId") String cityIdString);

}
