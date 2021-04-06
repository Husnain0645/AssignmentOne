package com.example.mcsf19a043_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hadeesone(View view) {
        Intent intent=new Intent(this,hadeesone.class);
        startActivity(intent);
    }

    public void hadeestwo(View view) {
        Intent intent=new Intent(this,hadeestwo.class);
        startActivity(intent);
    }

    public void hadeesthree(View view) {
        Intent intent=new Intent(this,hadeesthree.class);
        startActivity(intent);
    }
}