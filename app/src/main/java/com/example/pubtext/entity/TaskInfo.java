package com.example.pubtext.entity;

import org.litepal.crud.LitePalSupport;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class  TaskInfo extends LitePalSupport {
    private boolean isTask=false;


    private int taskid;
    private String taskname;
    private String taskadress;
    private String taskdate;

    @Override
    public String toString() {
        return "TaskInfo{" +
                "isTask=" + isTask +
                ", taskid=" + taskid +
                ", taskname='" + taskname + '\'' +
                ", taskadress='" + taskadress + '\'' +
                ", taskdate='" + taskdate + '\'' +
                '}';
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public boolean isTask() {
        return isTask;
    }

    public void setTask(boolean task) {
        isTask = task;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskadress() {
        return taskadress;
    }

    public void setTaskadress(String taskadress) {
        this.taskadress = taskadress;
    }

    public String getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(String taskdate) {
        this.taskdate = taskdate;
    }
}
