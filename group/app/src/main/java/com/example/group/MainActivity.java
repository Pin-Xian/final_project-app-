package com.example.group;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AliasActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //回首頁

        Button button_a= findViewById(R.id.button_a);

        button_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Intent intent =new Intent(MainActivity.this,Main2Activity.class);
////                    startActivity(intent);
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.news1");
                    startActivity(intent);
                }
        });

        Button button_c= findViewById(R.id.button_c);
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        Button button_e= findViewById(R.id.button_e);
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

    }


}
