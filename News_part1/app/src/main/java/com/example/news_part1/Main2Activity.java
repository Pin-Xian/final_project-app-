package com.example.news_part1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToKeyword(View view) {
        Intent intent =  new Intent(Main2Activity.this, Keyword5Activity.class);
        startActivity(intent);
    }
}
