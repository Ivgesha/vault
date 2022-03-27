package com.example.vault.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.vault.models.Record;

import java.util.List;

public class RecordListViewModel {

    private MutableLiveData<List<Record>> mRecords;

    public LiveData<List<Record>> getRecords() {
        return mRecords;
    }
}
