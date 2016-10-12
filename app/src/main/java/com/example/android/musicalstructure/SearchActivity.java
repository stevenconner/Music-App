package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Finds the image for now playing and stores in a variable
        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlayingImageView);
        ImageView mainLogo = (ImageView) findViewById(R.id.mainLogoImageView);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play icon is clicked
            @Override
            public void onClick(View view) {
                //Create a new intent to open the correct activity
                Intent nowPlayingIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        mainLogo.setOnClickListener(new View.OnClickListener() {
            //The code here will execute when the logo is clicked
            @Override
            public void onClick(View view) {
                Intent mainLogoIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(mainLogoIntent);
            }
        });
    }
}
