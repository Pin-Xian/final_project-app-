package com.example.newsource2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Article1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article1);
    }
    public void goToKeyword(View view) {
        Intent intent =  new Intent(Article1Activity.this, Article1SimilarActivity.class);
        startActivity(intent);
    }

}

