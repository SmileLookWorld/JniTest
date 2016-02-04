package com.gisroad.jnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String s = Jni.getName("你好世界！");
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.txt);
        tv.setText(s);
    }
}
