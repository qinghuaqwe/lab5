package edu.temple.lab5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String myData[];
    String myData2[];

    public ColorAdapter(Context context, String myData[],String myData2[]){
        this.context = context;
        this.myData = myData;
        this.myData2 = myData2;
    }

    @Override
    public int getCount() {
        return myData2.length;

    }

    /*public int getCount2(){
        return myData1.length;
    }*/

    @Override
    public Object getItem(int position) {
        return myData2[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textview = new TextView(context);
        textview.setBackgroundColor(android.graphics.Color.parseColor(myData2[position]));
        textview.setText(myData[position]);

        return textview;
    }

    /*
    Context context;
    String myData[];

    public ColorAdapter(Context context, String myData[]){
        this.context = context;
        this.myData = myData;
    }

    @Override
    public int getCount() {
        return myData.length;
    }

    @Override
    public Object getItem(int position) {
        return myData[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textview = new TextView(context);
        textview.setBackgroundColor(android.graphics.Color.parseColor(myData[position]));
        textview.setText(myData[position]);

        return textview;
    }
    */

}
