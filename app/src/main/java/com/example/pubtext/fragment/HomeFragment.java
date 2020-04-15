package com.example.pubtext.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.example.pubtext.R;
import com.example.pubtext.adapter.TaskInfoAdapter;
import com.example.pubtext.entity.TaskInfo;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.kyleduo.switchbutton.SwitchButton;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<TaskInfo> taskInfos;
    private RecyclerView mRecyclerView;
    private TaskInfoAdapter mtaskinfoadapter;
    private Button btn;
    private MaterialSpinner spinner;
    private SwitchButton switchButton;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        spinner = root.findViewById(R.id.spinner);
         switchButton = root.findViewById(R.id.switch_button);
        mRecyclerView = root.findViewById(R.id.rv_list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        datas=new ArrayList<>();
//        TaskInfo taskInfo =new TaskInfo();
        taskInfos = new ArrayList<>();
        TaskInfo taskinfo;
        for (int i = 0; i < 15; i++) {
            taskinfo = new TaskInfo();
            taskinfo.setTaskid(i);
            taskinfo.setTaskname("第" + i + "条内容");
            taskinfo.setTaskadress("第" + i + "条地址");
            taskInfos.add(taskinfo);
        }
        initAdapter();
        initMenu();
       // taskInfos= LitePal.findAll(TaskInfo.class);






        return root;
    }


    private void initAdapter() {

        mtaskinfoadapter =new TaskInfoAdapter();

        mtaskinfoadapter.setAnimationEnable(true);
        int mFirstPageItemCount = 5;

        mtaskinfoadapter.addChildClickViewIds(R.id.imageView,R.id.taskname,R.id.taskadress,R.id.taskdate);
        mtaskinfoadapter.setOnItemChildClickListener(new OnItemChildClickListener() {
            @Override
            public void onItemChildClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Toast.makeText(getActivity(), "点击了第" + (position + 1) + "条条目的图片", Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(mtaskinfoadapter);
//
    }

    private void initMenu() {

        //spinner.setItems("AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "Custom1", "Custom2");
        spinner.setItems("紧急", "日常", "临时", "重要");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                switch (position) {
                    case 0:
                        mtaskinfoadapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.AlphaIn);
                        break;
                    case 1:
                        mtaskinfoadapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.ScaleIn);
                        break;
                    case 2:
                        mtaskinfoadapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.SlideInBottom);
                        break;
                    case 3:
                        mtaskinfoadapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.SlideInLeft);
                        break;
                    case 4:
                        mtaskinfoadapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.SlideInRight);
                        break;
//
                    default:
                        break;
                }
                //mRecyclerView.setAdapter(mtaskinfoadapter);
            }
        });
        //init firstOnly state
        mtaskinfoadapter.setAnimationFirstOnly(false);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(final CompoundButton buttonView, final boolean isChecked) {
                if (isChecked) {
                    mtaskinfoadapter.setAnimationFirstOnly(true);
                } else {
                    mtaskinfoadapter.setAnimationFirstOnly(false);
                }
                mtaskinfoadapter.notifyDataSetChanged();
            }
        });

    }


}
