package test.dmdfchina.com.scroll_suspend;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;

import test.dmdfchina.com.scroll_suspend.databinding.ActivityConstraintBinding;

public class ConstraintActivity extends AppCompatActivity implements OnMyScrollListener {
    private CustomScrollView te_scroll;
    private RelativeLayout v_space;
    private RelativeLayout stick_view;
    private TeacherInfoBean teacherInfo;
    private ActivityConstraintBinding binding;
    private ListView course_listView;
    private CourseAdapter<TeacherInfoBean.DBean.ListBean> adapter;
    private List<TeacherInfoBean.DBean.ListBean> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        // setContentView(R.layout.activity_constraint);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_constraint);
        initView();
        adapter = new CourseAdapter<>(mList, BR.list, R.layout.recycler_living_item);
        course_listView.setAdapter(adapter);
        getNetData(AllPathUtils.teaUrl, AllPathUtils.uid, "150");
        course_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ConstraintActivity.this, MainActivity.class));
            }
        });
    }

    /*w网络数据*/
    public void getNetData(String url, String id, String t_id) {
        ExeApplication.getMyApplication().getInstance().getTeacherInfo(url, id, t_id, new MyHttpUtils.OnJsonData() {
            @Override
            public void passJsonData(String requestJson) {
                if (!TextUtils.isEmpty(requestJson)) {
                    teacherInfo = new Gson().fromJson(requestJson, TeacherInfoBean.class);
                    Log.d("tag", "passJsonData: =获取的信息是=" + teacherInfo.getD().getTeacher_img() + "  ," + teacherInfo.getD().getContent());
                    binding.setTeacherInfo(teacherInfo.getD());
                    Log.d("tag", "passJsonData: --这里走了吗？？");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mList.clear();
                            mList.addAll(teacherInfo.getD().getList());
                            adapter.notifyDataSetChanged();
                        }
                    });
                }
            }
        });
    }

    private void initView() {
        te_scroll = (CustomScrollView) findViewById(R.id.te_scroll);
        te_scroll.registerListener(this);
        v_space = (RelativeLayout) findViewById(R.id.v_space);
        stick_view = (RelativeLayout) findViewById(R.id.stick_view);
        stick_view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                onMyscroll(0, 0);
            }
        });
        /****************以上部分是scrollView的悬停效果***************/

        course_listView = (ListView) findViewById(R.id.course_listView);
    }


    @Override
    public void onMyscroll(int left, int top) {
        stick_view.setTranslationY(Math.max(top, v_space.getTop()));
    }
}
