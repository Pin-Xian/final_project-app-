package com.example.news1;

import android.content.Context;
import android.os.Bundle;

import com.example.news1.ui.main.BlankFragment2;
import com.example.news1.ui.main.BlankFragment3;
import com.example.news1.ui.main.BlankFragment4;
import com.example.news1.ui.main.BlankFragment5;
import com.example.news1.ui.main.PlaceholderFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
//import android.support.v4.view.ViewPager;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.news1.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
//        ViewPager viewPager = findViewById(R.id.view_pager);
//        viewPager.setAdapter(sectionsPagerAdapter);
//        TabLayout tabs = findViewById(R.id.tabs);
//        tabs.setupWithViewPager(viewPager);
//        FloatingActionButton fab = findViewById(R.id.fab);
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        }
        Log.v("tag","wtf");
        SimpleFragmentPageAdapter simpleFragmentPageAdapter = new SimpleFragmentPageAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(simpleFragmentPageAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        simpleFragmentPageAdapter.addItem(new PlaceholderFragment());
        simpleFragmentPageAdapter.addItem(new BlankFragment2());
        simpleFragmentPageAdapter.addItem(new BlankFragment3());
        simpleFragmentPageAdapter.addItem(new BlankFragment4());
        simpleFragmentPageAdapter.addItem(new BlankFragment5());

    }

    class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
        String title[] = {"tab1","tab2","tab3","tab4","tab5"};
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