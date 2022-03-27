package com.example.vault;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vault.adapters.RecordAdapter;

public class Record_list extends AppCompatActivity {


    private RecyclerView recordRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_list);



        recordRecyclerView = findViewById(R.id.recordListId);
    }


}