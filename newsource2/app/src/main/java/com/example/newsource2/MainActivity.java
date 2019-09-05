package com.example.newsource2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.util.Log;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Intent = new Intent(MainActivity.this, Article1Activity.class);
                startActivity(Intent);
                finish();
            }
        }, 13000);

        Log.v("tag","no");
        SimpleFragmentPageAdapter simpleFragmentPageAdapter = new SimpleFragmentPageAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.tabs);

        viewPager.setAdapter(simpleFragmentPageAdapter);
        tabs.setupWithViewPager(viewPager);

        simpleFragmentPageAdapter.addItem(new PlaceholderFragment());
        simpleFragmentPageAdapter.addItem(new BlankFragment2());
        simpleFragmentPageAdapter.addItem(new BlankFragment3());
        simpleFragmentPageAdapter.addItem(new BlankFragment4());
        simpleFragmentPageAdapter.addItem(new BlankFragment5());




    }

    public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
        String title[] = {"娛樂","金融","國際","政治","社會"};
        Context context;
        ArrayList<Fragment> fragmentArrayList = new ArrayList<Fragment>();
        public SimpleFragmentPageAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addItem(Fragment fragment){
            fragmentArrayList.add(fragment);
            notifyDataSetChanged();
        }



        @Override
        public Fragment getItem(int position) {
            return fragmentArrayList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }


}