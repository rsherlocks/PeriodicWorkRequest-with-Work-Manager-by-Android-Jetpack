package com.example.androidshaper.periodicworkrequestwithworkmanagerbyandroidjetpack;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorkA extends Worker {
    final String TAG="MyWorkA";
    Context context;
    public MyWorkA(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }



    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAG, "doWork: MyWorker");

//        Toast.makeText(context,"doWork: MyWorker",Toast.LENGTH_SHORT).show();


        return Result.success();
    }
}
