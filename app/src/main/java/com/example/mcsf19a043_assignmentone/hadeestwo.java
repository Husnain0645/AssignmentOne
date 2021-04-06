package com.example.mcsf19a043_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class hadeestwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeestwo);


        VideoView videoView=findViewById(R.id.videoView3);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hadeestwo);

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}