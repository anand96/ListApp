package com.example.user.listveiw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 6/15/2016.
 */
public class Newclss extends ArrayAdapter<String>
{
    Context context;
    int []imga;
    String []courses;
    public Newclss(Context context,int[]imga,String[]courses)
    {
        super(context, R.layout.contact,courses);
        this.context=context;
        this.imga=imga;
        this.courses=courses;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.contact,parent,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.iv);
        TextView textView= (TextView) view.findViewById(R.id.t);
        textView.setText(courses[position]);
        imageView.setImageResource(imga[position]);
        return view;
    }
}
