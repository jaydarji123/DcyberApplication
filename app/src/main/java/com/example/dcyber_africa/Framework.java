package com.example.dcyber_africa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Framework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framework);
        getSupportActionBar().setTitle("Framework");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}