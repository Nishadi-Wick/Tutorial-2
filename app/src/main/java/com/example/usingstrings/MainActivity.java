package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView2 = findViewById(R.id.txtVMsg2);
        txtView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "OnStart() Invoked");
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle", "OnResume() Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle", "OnPause() Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle" , "OnStop() Invoked") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle", "OnDestroy() Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Lifecycle", "OnRestart() Invoked");
    }
}