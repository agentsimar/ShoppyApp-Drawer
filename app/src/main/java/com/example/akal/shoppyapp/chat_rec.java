package com.example.akal.shoppyapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Akal on 21-11-2017.
 */

public class chat_rec extends RecyclerView.ViewHolder {

    TextView leftText,rightText;

    public chat_rec(View itemView){
        super(itemView);

        leftText = (TextView) itemView.findViewById(R.id.leftText);
        rightText = (TextView)itemView.findViewById(R.id.rightText);


    }
}