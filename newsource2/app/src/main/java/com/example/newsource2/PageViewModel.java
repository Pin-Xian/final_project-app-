package com.example.newsource2;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

class PageViewModel {
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "Hello world from section: " + input;
        }



    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}
