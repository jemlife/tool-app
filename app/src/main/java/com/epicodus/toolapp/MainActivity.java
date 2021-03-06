package com.epicodus.toolapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBandMembersButton;
    private Button mDiscographyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBandMembersButton = (Button) findViewById(R.id.bandMemberButton);
        mDiscographyButton = (Button) findViewById((R.id.discographyButton));

        mBandMembersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BandMemberActivity.class);
                startActivity(intent);
            }
        });

        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, DiscographyActivity.class);
                startActivity(intent);
            }
        });
    }
}
