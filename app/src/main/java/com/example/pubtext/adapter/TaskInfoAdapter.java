package com.example.pubtext.adapter;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.pubtext.R;
import com.example.pubtext.TaskInfoHelper;
import com.example.pubtext.entity.TaskInfo;

import java.util.List;

public class TaskInfoAdapter extends BaseQuickAdapter<TaskInfo, BaseViewHolder> {

//   public TaskInfoAdapter() {
//       super(R.layout.item_click_view, DataServer.getSampleData2(100));
//   }
//public TaskInfoAdapter(@Nullable List<TaskInfo> data) {
public TaskInfoAdapter() {
       super(R.layout.item_click_view, TaskInfoHelper.Findall());
    }
    private Button subbut;
    private boolean istask=false;
    private List<TaskInfo> taskInfos;
    @Override
    protected void convert(BaseViewHolder helper, TaskInfo item) {
//        istask=item.isTask();
//        switch (istask){
//            case true:
//                helper.setText(R.id.btn,"");
//                break;
//            case false:
//                helper.setText(R.id.btn,"");
//
//        }
        TextView urgency;
        TextView importance;
        switch (helper.getLayoutPosition() % 3) {
            case 0:
                helper.setImageResource(R.id.imageView, R.mipmap.animation_img1);
                helper.setVisible(R.id.importance,true);
                helper.setVisible(R.id.urgency,false);
                helper.setText(R.id.btn, "待完成");

                break;
            case 1:
                helper.setImageResource(R.id.imageView, R.mipmap.animation_img1);
                helper.setVisible(R.id.importance,false);
                helper.setVisible(R.id.urgency,true);
                helper.setText(R.id.btn, "未开始");

                break;
            case 2:
                helper.setImageResource(R.id.imageView, R.mipmap.animation_img1);
                helper.setVisible(R.id.importance,true);
                helper.setVisible(R.id.urgency,true);
                helper.setText(R.id.btn, "已完成");
                helper.setBackgroundColor(R.id.btn, Color.parseColor("#2979ff"));

                break;
            default:
                break;
        }

        /*
        *
        *
        * 添加点击事件。
        *
        * */
        addChildClickViewIds(R.id.btn);
        helper.setText(R.id.taskid, "任务编码："+String.valueOf(item.getTaskid()))
              .setText(R.id.taskname, item.getTaskname())
              .setText(R.id.taskadress,"任务地址"+ item.getTaskadress())
              .setText(R.id.taskdate,"04/05");
        ((TextView) helper.getView(R.id.taskname)).setFocusable(false);
        ((TextView) helper.getView(R.id.taskname)).setClickable(false);
        ((TextView) helper.getView(R.id.taskname)).setLongClickable(false);

        //获取当前条目position
        //int position = helper.getLayoutPosition();


    }

    private ClickableSpan clickableSpan = new ClickableSpan() {
        @Override
        public void onClick(@NonNull View widget) {
            Toast toast = Toast.makeText(getContext(),"事件触发了 landscapes and nedes",Toast.LENGTH_SHORT);
            toast.show();
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(getContext().getResources().getColor(R.color.clickspan_color));
            ds.setUnderlineText(true);
        }
    };
}
