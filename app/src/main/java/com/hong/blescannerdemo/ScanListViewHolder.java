package com.hong.blescannerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ftuser on 13/5/16.
 */
public class ScanListViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.ble_device_label)
    public TextView bleDeviceLabel;

    public ScanListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
