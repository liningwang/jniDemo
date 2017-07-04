package com.example.administrator.first;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;

import okhttp3.OkHttpClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            boolean a = savedInstanceState.getBoolean("a");
        }
        setContentView(R.layout.activity_main);
        Log.d("wang","onCreate " + stringFromJNI());
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.exit(0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("wang","onDestroy");
    }

    public native String stringFromJNI();
    static {
        System.loadLibrary("hello-jni");
    }
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("wang","onSaveInstanceState");
        outState.putBoolean("a",true);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("wang","onConfigurationChanged");
    }
}
