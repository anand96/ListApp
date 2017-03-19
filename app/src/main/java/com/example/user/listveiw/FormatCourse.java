package com.example.user.listveiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FormatCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_format_course);

        TextView textView= (TextView) findViewById(R.id.cn);
        TextView textView1= (TextView) findViewById(R.id.para);
        ImageView imageView= (ImageView) findViewById(R.id.imagesofcourse);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("cname"));
        imageView.setImageResource(intent.getIntExtra("pics",0));
        textView1.setText(intent.getStringExtra("parag"));
    }
}
