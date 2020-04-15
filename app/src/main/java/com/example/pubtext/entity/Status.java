package com.example.pubtext.entity;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class  Status {
    private boolean isTask=false;
    private String taskname;
    private String taskadress;
    private String taskdate;


    @Override
    public String toString() {
        return "Status{" +
                ", taskname='" + taskname + '\'' +
                ", taskadress='" + taskadress + '\'' +
                ", taskdate='" + taskdate + '\'' +
                '}';
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
