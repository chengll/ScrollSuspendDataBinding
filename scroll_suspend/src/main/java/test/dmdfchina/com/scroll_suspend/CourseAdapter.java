package test.dmdfchina.com.scroll_suspend;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by mkt on 2018/1/9.
 */

public class CourseAdapter<T> extends BaseAdapter {
    private List<T> mList;
    private int variableId;
    private int layoutId;
    public CourseAdapter(List<T> mList,int variableId,int layoutId){
        this.mList=mList;
        this.variableId=variableId;
        this.layoutId=layoutId;
    }
    @Override
    public int getCount() {
        return mList==null?0:mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding dataBinding;
        if (convertView==null){
            dataBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),layoutId,parent,false);
        }else{
            dataBinding=DataBindingUtil.getBinding(convertView);
        }
        dataBinding.setVariable(variableId,mList.get(position));
        return dataBinding.getRoot();
    }

}
