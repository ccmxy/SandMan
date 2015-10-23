package com.example.guest.band.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.guest.band.R;

public class MainActivity extends AppCompatActivity {
    private Button mBandMembersButton;
    private Button mDiscographyButton;
    private Button mTourDatesButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBandMembersButton = (Button) findViewById(R.id.bandMembersButton);
        mDiscographyButton = (Button) findViewById(R.id.discographyButton);
        mTourDatesButton = (Button) findViewById(R.id.tourDatesButton);

        mBandMembersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BandMembersActivity.class);
                startActivity(intent);
            }
        });
        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, discography.class);
                startActivity(intent);
            }
        });
        mTourDatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TourDatesActivity.class);
                startActivity(intent);
            }
        });
    }

}
