package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView=findViewById(R.id.video_view);

        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_song);

        MediaController controller=new MediaController(this);
        videoView.setMediaController(controller);

        controller.setAnchorView(videoView);
        videoView.start();

    }
}