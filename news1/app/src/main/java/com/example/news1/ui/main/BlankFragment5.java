package com.example.news1.ui.main;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.news1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment5 extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static BlankFragment5 newInstance(int index) {
        BlankFragment5 fragment = new BlankFragment5();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main5, container, false);
    }

}
