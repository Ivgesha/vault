package com.example.vault.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vault.R;
import com.example.vault.models.Record;

import java.util.ArrayList;

public class RecordAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Record> records = new ArrayList<>();

    public RecordAdapter( ) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_record_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    // TODO: FIX
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.record_title.setText(records.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView record_title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            record_title = itemView.findViewById(R.id.record_title);
        }
    }

}
