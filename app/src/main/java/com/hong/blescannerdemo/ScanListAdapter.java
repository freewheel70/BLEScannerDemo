package com.hong.blescannerdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ftuser on 13/5/16.
 */
public class ScanListAdapter extends RecyclerView.Adapter<ScanListViewHolder> {

    List<String> deviceList;
    LayoutInflater inflater;
    Context context;

    public ScanListAdapter(Context context, LayoutInflater inflater, List<String> deviceList) {
        this.context = context;
        this.inflater = inflater;
        this.deviceList = deviceList;
    }

    @Override
    public ScanListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_scan_list, parent, false);
        ScanListViewHolder viewHolder = new ScanListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ScanListViewHolder holder, int position) {
        holder.bleDeviceLabel.setText(deviceList.get(position));
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }
}
