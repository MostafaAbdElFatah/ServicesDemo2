package com.mostafaabdel_fatah.servicesdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartActivity_btnClicked(View view) {
        Intent intent = new Intent(MainActivity.this,MyServices.class);
        startService(intent);
    }

    public void StopActivity_btnClicked(View view) {
        Intent intent = new Intent(MainActivity.this,MyServices.class);
        stopService(intent);
    }
}
