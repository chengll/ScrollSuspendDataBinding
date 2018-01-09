package test.dmdfchina.com.scroll_suspend;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by mkt on 2018/1/8.
 */

public class CourseInfoBean extends BaseObservable {
    /*
    {
    "id": "116",
    "lesson_name": "如何经营一个好门店？让我们从打造一个好店长开始！",
    "price": "88",
    "small_img_url": "http:\/\/capp.dameiketang.com\/Uploads\/smalladvertisement\/1461590122.jpg",
    "c_time": "1459416080",
    "all_time": null,
    "is_look": "0"
    }
    */
    private String id;
    private String lesson_name;
    private String small_img_url;
    private String is_look;

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Bindable
    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }

    @Bindable
    public String getSmall_img_url() {
        return small_img_url;
    }

    public void setSmall_img_url(String small_img_url) {
        this.small_img_url = small_img_url;
    }

    @Bindable
    public String getIs_look() {
        return is_look;
    }

    public void setIs_look(String is_look) {
        this.is_look = is_look;
    }

    public void onItemClickListener(View itemView){
        Toast.makeText(itemView.getContext(),"点击了此处",Toast.LENGTH_SHORT).show();
        ExeApplication.getMyApplication().startActivity(new Intent(itemView.getContext(),MainActivity.class));
    }

    /*加载图片的方法*/

    @BindingAdapter({"image"})
    public static void getImage(ImageView imageView,String small_img_url ){
        Picasso.with(imageView.getContext()).load(small_img_url).into(imageView);
    }
}
