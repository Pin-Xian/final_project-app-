package com.example.newsource2;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


class BlankFragment4 extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static BlankFragment4 newInstance(int index) {
        BlankFragment4 fragment = new BlankFragment4();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main4, container, false);

    }

}