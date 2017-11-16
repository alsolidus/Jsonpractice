package com.chscommandcenter.jsonpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubosew on 8/6/2017.
 */

public class FacilitiesAdapter extends ArrayAdapter{
    List list = new ArrayList();
    public FacilitiesAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(Facilities object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        FacilitiesHolder facilitiesHolder;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.row_layout,parent,false);
            facilitiesHolder = new FacilitiesHolder();

            facilitiesHolder.tx_entity=(TextView) row.findViewById(R.id.tx_entity);
            facilitiesHolder.tx_title=(TextView) row.findViewById(R.id.tx_title);
            facilitiesHolder.tx_phone=(TextView) row.findViewById(R.id.tx_phone);
            facilitiesHolder.tx_side=(TextView) row.findViewById(R.id.tx_side);
            row.setTag(facilitiesHolder);
        } else {
            facilitiesHolder=(FacilitiesHolder) row.getTag();
        }
        Facilities facilities=(Facilities)this.getItem(position);
        facilitiesHolder.tx_entity.setText(facilities.getEntity());
        facilitiesHolder.tx_title.setText(facilities.getTitle());
        facilitiesHolder.tx_side.setText(facilities.getSide());
        facilitiesHolder.tx_phone.setText(facilities.getPhone());
        return row;
    }

    static class FacilitiesHolder{
        TextView tx_entity,tx_title,tx_side,tx_phone;
    }
}
