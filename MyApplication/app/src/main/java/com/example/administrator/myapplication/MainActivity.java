package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.chrisbanes.photoview.PhotoView;
import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;
import com.jzxiang.pickerview.listener.OnDateSetListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photoviewTest();
    }

    private void photoviewTest() {
        PhotoView pv_test= (PhotoView) findViewById(R.id.pv_main_test);
        TimePickerDialog pickerDialog=new TimePickerDialog.Builder()
                .setCallBack(new OnDateSetListener() {
                    @Override
                    public void onDateSet(TimePickerDialog timePickerView, long millseconds) {
                        Log.e("ZDLW","daat: "+millseconds+"  dataString:  "+DateUtils.timetByOrginStr(String.valueOf(millseconds)));
                    }
                })
                .setTitleStringId("")
                .setCyclic(false)
                .setSelectorMillseconds(System.currentTimeMillis())
                .setType(Type.YEAR_MONTH_DAY)
                .setWheelItemTextSize(12)
                .build();
        pickerDialog.show(getSupportFragmentManager(),"");

    }
}
