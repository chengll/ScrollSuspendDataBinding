package test.dmdfchina.com.scroll_suspend;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mkt on 2017/10/25.
 * 名师中心老师详情和主讲课程
 */

public class TeacherInfoBean extends BaseObservable {


    /**
     * i : 9
     * r : 1
     * m : 查找成功
     * d : {"id":"151","teacher_name":"岳晓琳","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1496216094.jpg","content":"LIN\u2022MAKEUP创始人 美课堂签约名师 LIN彩妆品牌创始人 国家级化妆造型评委    ","fans":"38917","focus":0,"list":[{"id":"1154","lesson_name":"【名师有约第八期】顶级时尚造型艺术家 岳晓琳","price":"198","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1497435649.jpg","c_time":"1497332425","all_time":null,"is_look":"0"},{"id":"1310","lesson_name":"美课堂免费体验课","price":"0","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1504251446.jpg","c_time":"1504064075","all_time":null,"is_look":"0"}]}
     * e : []
     * q : []
     * t : 1508916369
     */

    private int i;
    private int r;
    private String m;
    private DBean d;
    private int t;
    private List<?> e;
    private List<?> q;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Bindable
    public DBean getD() {
        return d;
    }

    public void setD(DBean d) {
        this.d = d;
        notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.d);
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public List<?> getE() {
        return e;
    }

    public void setE(List<?> e) {
        this.e = e;
    }

    public List<?> getQ() {
        return q;
    }

    public void setQ(List<?> q) {
        this.q = q;
    }


    public static class DBean extends BaseObservable {
        /**
         * id : 151
         * teacher_name : 岳晓琳
         * teacher_img : http://capp.dameiketang.com/Uploads/bigadvertisement/1496216094.jpg
         * content : LIN•MAKEUP创始人 美课堂签约名师 LIN彩妆品牌创始人 国家级化妆造型评委
         * fans : 38917
         * focus : 0
         * list : [{"id":"1154","lesson_name":"【名师有约第八期】顶级时尚造型艺术家 岳晓琳","price":"198","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1497435649.jpg","c_time":"1497332425","all_time":null,"is_look":"0"},{"id":"1310","lesson_name":"美课堂免费体验课","price":"0","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1504251446.jpg","c_time":"1504064075","all_time":null,"is_look":"0"}]
         */

        private String id;
        private String teacher_name;
        private String teacher_img;
        private String content;
        private String fans;
        private int focus;
        private List<ListBean> list;

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
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.teacher_name);
        }

        @Bindable
        public String getTeacher_img() {
            return teacher_img;
        }

        public void setTeacher_img(String teacher_img) {
            this.teacher_img = teacher_img;
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.teacher_img);
        }

        @Bindable
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.content);
        }

        @Bindable
        public String getFans() {
            return fans;
        }

        public void setFans(String fans) {
            this.fans = fans;
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.fans);
        }

        @Bindable
        public int getFocus() {
            return focus;
        }

        public void setFocus(int focus) {
            this.focus = focus;
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.focus);
        }

        @BindingAdapter({"teacher_img"})
        public static void getPort(ImageView imageView, String teacher_img) {
            Picasso.with(imageView.getContext()).load(teacher_img).into(imageView);
        }

        @Bindable
        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
            notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.list);
        }

        public static class ListBean extends BaseObservable {
            /**
             * id : 1154
             * lesson_name : 【名师有约第八期】顶级时尚造型艺术家 岳晓琳
             * price : 198
             * small_img_url : http://capp.dameiketang.com/Uploads/smalladvertisement/1497435649.jpg
             * c_time : 1497332425
             * all_time : null
             * is_look : 0  是1的时候可试看，负责不能可试看
             */

            private String id;
            private String lesson_name;
            private String price;
            private String small_img_url;
            private String c_time;
            private Object all_time;
            private String is_look;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            @BindingAdapter({"image"})
            public static void getCourseImage(ImageView imageView, String small_img_url) {
                Picasso.with(imageView.getContext()).load(small_img_url).into(imageView);
            }

            @Bindable
            public String getLesson_name() {
                return lesson_name;
            }

            public void setLesson_name(String lesson_name) {
                this.lesson_name = lesson_name;
                notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.lesson_name);
            }

            @Bindable
            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
                notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.price);
            }

            @Bindable
            public String getSmall_img_url() {
                return small_img_url;
            }

            public void setSmall_img_url(String small_img_url) {
                this.small_img_url = small_img_url;
                notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.small_img_url);
            }

            @Bindable
            public String getIs_look() {
                return is_look;
            }

            public void setIs_look(String is_look) {
                this.is_look = is_look;
                notifyPropertyChanged(test.dmdfchina.com.scroll_suspend.BR.is_look);
            }

            public String getC_time() {
                return c_time;
            }

            public void setC_time(String c_time) {
                this.c_time = c_time;
            }

            public Object getAll_time() {
                return all_time;
            }

            public void setAll_time(Object all_time) {
                this.all_time = all_time;
            }


        }


    }
}
