package com.example.mcsf19a043_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class hadeesthree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesthree);

        VideoView videoView=findViewById(R.id.videoView5);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hadeesthree);

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}