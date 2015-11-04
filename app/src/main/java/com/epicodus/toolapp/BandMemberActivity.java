package com.epicodus.toolapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BandMemberActivity extends AppCompatActivity {

    private Button mNextMemberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band_member);

        mNextMemberButton = (Button) findViewById(R.id.nextMemberButton);
        mNextMemberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandMemberActivity.this, NextMemberActivity.class);
                startActivity(intent);
            }
        });

    }



}
