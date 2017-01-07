package com.jyqqhw.floatingball;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setHttpIntent();
    }

    public void startService(View view) {
        Intent intent = new Intent(this, FloatBallService.class);
        startService(intent);
    }

    //Android获取一个用于打开文本文件的intent
    public void setHttpIntent(){
        Intent intent = new Intent(Intent.ACTION_VIEW);    //为Intent设置Action属性
        intent.setData(Uri.parse("http://www.baidu.com")); //为Intent设置DATA属性
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//        finish();
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
        if(!hasFocus){
            Toast.makeText(MainActivity.this, "focused false", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "focused false.");
            finish();
        }else{
            Toast.makeText(MainActivity.this, "focused true", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "focused true.");
        }
    }
}
