package com.mostafaabdel_fatah.servicesdemo2;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Mostafa AbdEl_Fatah on 9/4/2017.
 */

public class MyServices extends IntentService {

    public MyServices() {
        super("My_Worker_Thread");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Toast.makeText(this,"Servicing Starting",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        Toast.makeText(this,"Servicing handleIntent",Toast.LENGTH_SHORT).show();
        synchronized (this){
            for (int i = 0; i < 10;i++){
                try {
                    wait(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Override
    public void onDestroy() {
        Toast.makeText(this,"Servicing done",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
