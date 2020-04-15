package com.example.pubtext;

import com.example.pubtext.entity.TaskInfo;

import org.litepal.LitePal;

import java.util.List;

public class TaskInfoHelper {

  public static List<TaskInfo> Findall(){
    List<TaskInfo> taskInfos= LitePal.findAll(TaskInfo.class);
      return taskInfos;
  }
}
