package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i( "Lifecycle" ,  "OnCreate called...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i( "Lifecycle", "OnStarted called...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i( "Lifecycle", "onRestart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i( "Lifecycle", "onResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i( "Lifecycle", "onPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i( "Lifecycle", "onStop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i( "Lifecycle", "onDestroy called...");
    }


}