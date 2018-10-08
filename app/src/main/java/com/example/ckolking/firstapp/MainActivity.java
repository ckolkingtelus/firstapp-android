package com.example.ckolking.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // this is where we take care of core business logic...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("tag", "In onCreate");
//        Log.e("tag", "In onCreate");
//        Log.i("tag", "In onCreate");
//        Log.w("tag", "In onCreate");

        //bring view on top of activity...
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        // then we expect "hello world" stuff

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "In onStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "In onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "In onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "In onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "In onDestroy");
    }
}
