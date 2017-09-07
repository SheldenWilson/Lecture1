package com.example.swilson4264.lecture1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // button action that brings to splashscreen
    public void goSplash(View view) {
        Intent intent = new Intent(this, Splashscreen.class);
        startActivity(intent);
    }
}
