package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Finds the image for now playing and stores in a variable
        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlayingImageView);
        ImageView mainLogo = (ImageView) findViewById(R.id.mainLogoImageView);

        mainLogo.setOnClickListener(new View.OnClickListener() {
            //The code here will execute when the logo is clicked
            @Override
            public void onClick(View view) {
                Intent mainLogoIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(mainLogoIntent);
            }
        });
    }
}
