package test.dmdfchina.com.scroll_suspend;

import android.text.TextUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by mkt on 2018/1/9.
 */

public class MyHttpUtils {
    /*
    http://api.dameiketang.com/manager.php?m=Admin&c=Newshow&a=TeacherDetail
    *id * uuid:
     t_id
    * */
    public static void getTeacherInfo(String url, String id,String  t_id,final OnJsonData onJsonData) {
        OkHttpClient client=new OkHttpClient();
        FormBody formBody=new FormBody.Builder().add("id",id).add("t_id",t_id).build();
        Request request=new Request.Builder().url(url).post(formBody).method("POST",formBody).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onJsonData.passJsonData(null);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String jsonString = response.body().string();
                if (!TextUtils.isEmpty(jsonString)){
                    onJsonData.passJsonData(jsonString);
                }else{
                    onJsonData.passJsonData(null);
                }
            }
        });
    }

    public interface OnJsonData{
        void passJsonData(String requestJson);
    }
}
