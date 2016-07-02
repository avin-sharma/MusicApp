package com.avinsharma.musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nowPlaying;
    TextView recentlyPlayed;
    TextView topLists;
    TextView discover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nowPlaying = (TextView) findViewById(R.id.now_playing);
        recentlyPlayed = (TextView) findViewById(R.id.recently_played);
        topLists = (TextView) findViewById(R.id.top_lists);
        discover = (TextView) findViewById(R.id.discover);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NowPlaying.class));
            }
        });

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecentlyPlayed.class));
            }
        });

        topLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TopLists.class));
            }
        });

        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Library.class));
            }
        });
    }
}
