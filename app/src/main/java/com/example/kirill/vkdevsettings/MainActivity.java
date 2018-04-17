package com.example.kirill.vkdevsettings;

import android.content.ComponentName;
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

    public void devBtnClick(View v) {
        Intent i = new Intent();
        i.setComponent(new ComponentName("com.vkontakte.android", "com.vkontakte.android.DebugBroadcastReceiver"));
        sendBroadcast(i);
    }
}
