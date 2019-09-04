package com.example.newsource2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Article2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article2);
    }
    public void goToKeyword(View view) {
        Intent intent =  new Intent(Article2Activity.this, Article2SimilarActivity.class);
        startActivity(intent);
    }
}
