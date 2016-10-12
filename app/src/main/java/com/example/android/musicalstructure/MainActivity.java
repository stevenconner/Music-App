package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the imageviews and store in a variable.
        ImageView files = (ImageView) findViewById(R.id.filesImageView);
        ImageView search = (ImageView) findViewById(R.id.searchImageView);
        ImageView about = (ImageView) findViewById(R.id.aboutImageView);
        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlayingImageView);

        files.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the files icon is clicked
            @Override
            public void onClick(View view) {
                //Create a new intent to open the correct activity
                Intent filesIntent = new Intent(MainActivity.this, FilesActivity.class);
                startActivity(filesIntent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search icon is clicked
            @Override
            public void onClick(View view) {
                //Create a new intent to open the correct activity
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the logo is clicked
            @Override
            public void onClick(View view) {
                //Create a new intent to open the correct activity
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play icon is clicked
            @Override
            public void onClick(View view) {
                //Create a new intent to open the correct activity
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
