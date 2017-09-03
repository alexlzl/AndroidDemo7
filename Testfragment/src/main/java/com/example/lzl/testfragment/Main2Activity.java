package com.example.lzl.testfragment;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    private static String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "Main2Activity===onCreate");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Main2Activity===onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "Main2Activity===onSaveInstanceState");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TAG", "Main2Activity===onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Main2Activity===onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Main2Activity===onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Main2Activity===onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Main2Activity===onStop");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG, "Main2Activity===finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main2Activity===onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Main2Activity===onRestart");
    }
}
