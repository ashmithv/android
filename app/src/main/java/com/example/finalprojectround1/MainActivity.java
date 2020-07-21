package com.example.finalprojectround1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.concert8,R.drawable.concert2,R.drawable.concert7
    ,R.drawable.concert4,R.drawable.concert5,R.drawable.concert6};

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.music_concerts);
        s2= getResources().getStringArray(R.array.place);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        int imgarray[]={R.drawable.asingh,R.drawable.mmello,R.drawable.snigam};

        flipper=(ViewFlipper)findViewById(R.id.flipper);

        for(int i=0;i<imgarray.length;i++)
            showimage(imgarray[i]);

    }

    public  void  showimage(int img)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);

        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
    
      }