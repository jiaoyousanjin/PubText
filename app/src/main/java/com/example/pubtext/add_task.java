package com.example.pubtext;


import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pubtext.entity.TaskInfo;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;


public class add_task extends AppCompatActivity {
    @BindView(R.id.notificationTimeText)
    TextView notificationTimeText;
    @BindView(R.id.startTimeText)
    TextView startTimeText;
    @BindView(R.id.deadlineText)
    TextView deadlineText;
    @BindView(R.id.taskid)
    EditText taskid;
    @BindView(R.id.taskname)
    EditText taskname;
    @BindView(R.id.taskadress)
    EditText taskadress;
    Calendar[] notificationTime = {null};
    Calendar[] startTime = {null};
    Calendar[] deadline = {null};
    int id;
    String name;
    String adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);
        ButterKnife.bind(this);

        initview();

    }

    private void initview() {

        CheckBox importanceBox = findViewById(R.id.setImportant);
        CheckBox urgencyBox = findViewById(R.id.setUrgent);
         Button button =findViewById(R.id.sub_btn);
        startTimeText.setText(R.string.not_set);
        notificationTimeText.setText(R.string.not_set);
        deadlineText.setText(R.string.not_set);
        if (notificationTime[0] == null) {
            notificationTimeText.setText(R.string.not_set);
        } else {
            notificationTimeText.setText(CustomDate.getDateString(notificationTime[0], this));
        }
        if (startTime[0] == null) {
            startTimeText.setText(R.string.not_set);
        } else {
            startTimeText.setText(CustomDate.getDateString(startTime[0], this));
        }
        if (deadline[0] == null) {
            deadlineText.setText(R.string.not_set);
        } else {
            deadlineText.setText(CustomDate.getDateString(deadline[0], this));
        }
        ImageButton setNotificationTime = findViewById(R.id.editNotificationTime);
        ImageButton setStartTime = findViewById(R.id.editStartTime);
        ImageButton setDeadline = findViewById(R.id.editDeadline);
        setNotificationTime.setOnClickListener(v -> getDateTime(notificationTime, 0));
        setStartTime.setOnClickListener(v -> getDateTime(startTime, 1));
        setDeadline.setOnClickListener(v -> getDateTime(deadline, 2));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                LitePal.getDatabase();
//                Toast.makeText(add_task.this,"数据库创建成功",Toast.LENGTH_LONG).show();
             //   int id= Integer.parseInt(taskid.getText().toString());
                id = Integer.parseInt((String) taskid.getText().toString());
               name=taskname.getText().toString();
                adress=taskadress.getText().toString();

                TaskInfo taskInfo=new TaskInfo();
                taskInfo.setTaskid(id);
                taskInfo.setTaskname(name);
                taskInfo.setTaskadress(adress);
                 Toast.makeText(add_task.this,"--"+id+"--"+name+"--"+adress,Toast.LENGTH_LONG).show();

                taskInfo.save();

            }
        });
    }

    private void getDateTime(final Calendar[] calendar, int requestCode) {
        Calendar now = Calendar.getInstance();
        DatePickerDialog dialog =
                DatePickerDialog.newInstance(
                        (view1, year, monthOfYear, dayOfMonth) -> {
                            TimePickerDialog dialog1 =
                                    TimePickerDialog.newInstance(
                                            (view2, hourOfDay, minute, second) -> {
                                                Calendar time = Calendar.getInstance();
                                                time.set(year, monthOfYear, dayOfMonth, hourOfDay, minute);
                                                time.set(Calendar.SECOND, 0);
                                                calendar[0] = time;
                                                switch (requestCode) {
                                                    case 0:
                                                        notificationTimeText.setText(CustomDate.getDateString(time, this));
                                                        break;
                                                    case 1:
                                                        startTimeText.setText(CustomDate.getDateString(time, this));
                                                        break;
                                                    case 2:
                                                        deadlineText.setText(CustomDate.getDateString(time, this));
                                                        break;
                                                    default:
                                                }
                                                // Todo
                                            },
                                            now.get(Calendar.HOUR_OF_DAY),
                                            now.get(Calendar.MINUTE),
                                            DateFormat.is24HourFormat(this));
                            if (year == now.get(Calendar.YEAR)
                                    && monthOfYear == now.get(Calendar.MONTH)
                                    && dayOfMonth == now.get(Calendar.DAY_OF_MONTH) && requestCode != 1) {
                                dialog1.setMinTime(
                                        now.get(Calendar.HOUR_OF_DAY),
                                        now.get(Calendar.MINUTE),
                                        now.get(Calendar.SECOND));
                            }
                            dialog1.show(getSupportFragmentManager(), "TimePickerDialog");
                        },
                        // Initial year selection
                        now.get(Calendar.YEAR),
                        // Initial month selection
                        now.get(Calendar.MONTH),
                        // Inital day selection
                        now.get(Calendar.DAY_OF_MONTH));
        if (requestCode != 1) {
            dialog.setMinDate(now);
        }
        dialog.show(getSupportFragmentManager(), "DatePickerDialog");
    }

}