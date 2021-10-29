package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }

    public void PlayMethod(View view) {
        if (player==null){
            player=MediaPlayer.create(this,R.raw.audio_song);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    StopPlayer();
                }
            });
        }
        player.start();
    }

    public void PauseMethod(View view) {

        if (player !=null){
            player.pause();
        }
    }

    public void StopMethod(View view) {

        StopPlayer();
    }

    public void StopPlayer(){
        if (player !=null){
            player.release();
            player=null;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        StopPlayer();
    }
}