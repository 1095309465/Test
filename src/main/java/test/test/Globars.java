package test.test;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by DELL on 2017/5/31.
 */

public class Globars {

    private static Globars globars;
    private Retrofit mRetrofit;
    private ApiStores mApiStores;
    private Globars(){
        createRetrofit();
    }

    public static  Globars newInstance(){
        if(globars==null){
            globars=new Globars();
        }
        return globars;
    }


    public ApiStores getApiStores(){
        return mApiStores;

    }

    private void  createRetrofit(){
        mRetrofit = new Retrofit.Builder() //01:获取Retrofit对象
                .baseUrl(ApiStores.API_SERVER_URL) //02采用链式结构绑定Base url
                // 注意：字符创解析器要放在Gson解析器前面，不然无法解析字符串
                //使用工厂模式创建字符串解析器
                .addConverterFactory(ScalarsConverterFactory.create())
                //使用工厂模式创建Gson的解析器
                .addConverterFactory(GsonConverterFactory.create())
                .build();
//04获取API接口的实现类的实例对象
        mApiStores = mRetrofit.create(ApiStores.class);

    }

}
