package test.dmdfchina.com.scroll_suspend;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mkt on 2018/1/8.
 */

public class TeacherInfo extends BaseObservable {
    private String i;
    private int r;
    private String m;
    private String  id;
    private String  teacher_name;
    private String teacher_img;
    private String content;
    private int fans;
    private int focus;
    private List<CourseInfoBean> d;

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Bindable
    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
    @Bindable
    public String getTeacher_img() {
        return teacher_img;
    }

    public void setTeacher_img(String teacher_img) {
        this.teacher_img = teacher_img;
    }
    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Bindable
    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }
    @Bindable
    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }
    @Bindable
    public List<CourseInfoBean> getmCourseList() {
        return d;
    }

    public void setmCourseList(List<CourseInfoBean> d) {
        this.d = d;
    }

    @BindingAdapter({"teacher_img"})
    public static void getTeacherImg(ImageView imageView,String teacher_img ){
        Picasso.with(imageView.getContext()).load(teacher_img).into(imageView);
    }
}
