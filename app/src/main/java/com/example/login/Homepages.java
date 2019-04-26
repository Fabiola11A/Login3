package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Homepages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepages);
        String use = getIntent().getStringExtra("username");
        Toast.makeText(Homepages.this,use, Toast.LENGTH_LONG).show();
    }
}
