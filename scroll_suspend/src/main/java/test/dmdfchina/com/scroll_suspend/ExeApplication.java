package test.dmdfchina.com.scroll_suspend;


import android.app.Application;

/**
 * Created by mkt on 2018/1/8.
 */

public class ExeApplication extends Application {
    private static ExeApplication application=null;

    //获取网络请求的单利模式
    private static MyHttpUtils mOkHttpUtils = new MyHttpUtils();

    public static MyHttpUtils getInstance() {
        return mOkHttpUtils;
    }
    public static ExeApplication getMyApplication() {
        if (application==null){
            synchronized (ExeApplication.class){
                if (application==null){
                    application=new ExeApplication();
                    return application;
                }
            }

        }
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
        getInstance();
    }
}
