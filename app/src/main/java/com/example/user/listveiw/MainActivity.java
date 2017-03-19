package com.example.user.listveiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.lv);
       final String []courses= getResources().getStringArray(R.array.courses);
        final String []para=getResources().getStringArray(R.array.paragrah);
        int []imga={R.drawable.a,
                R.drawable.cj,
                R.drawable.py,
                R.drawable.php,
                R.drawable.c,
                R.drawable.w,
                R.drawable.wd,
                R.drawable.es,
                R.drawable.dt,
                R.drawable.cy};
        final int []imges={R.drawable.ap1,
                R.drawable.cj1,
                R.drawable.py1,
                R.drawable.ph1,
                R.drawable.cc1,
                R.drawable.wk,
                R.drawable.wd1,
                R.drawable.es1,
                R.drawable.dt1,
                R.drawable.cs1};
        Newclss newclss=new Newclss(getApplicationContext(),imga,courses);
         listView.setAdapter(newclss);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),FormatCourse.class);
                intent.putExtra("cname",courses[position]);
                intent.putExtra("pics",imges[position]);
                intent.putExtra("parag",para[position]);
                startActivity(intent);
            }
        });

    }
}
