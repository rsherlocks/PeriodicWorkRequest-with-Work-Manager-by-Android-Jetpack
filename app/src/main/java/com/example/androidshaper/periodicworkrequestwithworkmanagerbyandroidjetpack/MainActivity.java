package com.example.androidshaper.periodicworkrequestwithworkmanagerbyandroidjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.content.Context;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyWorkA myWorkA=new MyWorkA(Context);

        PeriodicWorkRequest periodicWorkRequest=new PeriodicWorkRequest.Builder(MyWorkA.class,1, TimeUnit.SECONDS)
                .build();
        WorkManager.getInstance(getApplicationContext()).enqueue(periodicWorkRequest);
    }
}