package com.example.jhan.py_rado_upeu_2015;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JOEL on 19/05/2015.
 */
public class CustomGridViewAdapter extends ArrayAdapter<Item> {
    Context context;
    int layoutResourceId;
    ArrayList<Item> data = new ArrayList<Item>();

    public CustomGridViewAdapter(Context context, int resource, ArrayList<Item> data) {
        super(context, resource, data);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View row = convertView;
        RecordHolder holder = null;
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new RecordHolder();
            holder.txtNameApp = (TextView) row.findViewById(R.id.TxtNota);
            holder.EdtNota = (EditText) row.findViewById(R.id.EdtNameApp);
            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }
        Item item = data.get(position);
        holder.txtNameApp.setText(item.getName_apellidos());
        holder.EdtNota.setText(item.getNota());
        return row;
    }
    static class RecordHolder {
        TextView txtNameApp;
        EditText EdtNota;
    }


}
