package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Image extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        this.imageView = (ImageView) this.findViewById(R.id.imageView);
        this.imageView2 = (ImageView) this.findViewById(R.id.imageView2);
        this.imageView3 = (ImageView) this.findViewById(R.id.imageView3);


        Bundle extras = getIntent().getExtras();
        int text = extras.getInt("id");
        if (text == 1)
        {
            this.imageView.setImageResource(R.drawable.kurg);
            this.imageView2.setImageResource(R.drawable.kur2);
            this.imageView3.setImageResource(R.drawable.kurg3);
        }
        if (text == 2)
        {
            this.imageView.setImageResource(R.drawable.part);
            this.imageView2.setImageResource(R.drawable.part2);
            this.imageView3.setImageResource(R.drawable.part3);
        }
        if (text == 3)
        {
            this.imageView.setImageResource(R.drawable.vod);
            this.imageView2.setImageResource(R.drawable.vod2);
            this.imageView3.setImageResource(R.drawable.vod3);
        }
        if (text == 4)
        {
            this.imageView.setImageResource(R.drawable.tol);
            this.imageView2.setImageResource(R.drawable.tol2);
            this.imageView3.setImageResource(R.drawable.tol3);
        }
        if (text == 5)
        {
            this.imageView.setImageResource(R.drawable.teatr);
            this.imageView2.setImageResource(R.drawable.teatr2);
            this.imageView3.setImageResource(R.drawable.teatr3);
        }
        if (text == 6)
        {
            this.imageView.setImageResource(R.drawable.din);
            this.imageView2.setImageResource(R.drawable.din2);
            this.imageView3.setImageResource(R.drawable.din3);
        }
        if (text == 7)
        {
            this.imageView.setImageResource(R.drawable.pokr);
            this.imageView2.setImageResource(R.drawable.pokr2);
            this.imageView3.setImageResource(R.drawable.pokr3);
        }
        if (text == 8)
        {
            this.imageView.setImageResource(R.drawable.partpol);
            this.imageView2.setImageResource(R.drawable.partpol2);
            this.imageView3.setImageResource(R.drawable.partpol3);
        }
        if (text == 9)
        {
            this.imageView.setImageResource(R.drawable.swen);
            this.imageView2.setImageResource(R.drawable.swen2);
            this.imageView3.setImageResource(R.drawable.swen3);
        }
        if (text == 10)
        {
            this.imageView.setImageResource(R.drawable.pushkin);
            this.imageView2.setImageResource(R.drawable.pushkin2);
            this.imageView3.setImageResource(R.drawable.pushkin3);
        }
        if (text == 11)
        {
            this.imageView.setImageResource(R.drawable.lenin);
            this.imageView2.setImageResource(R.drawable.lenin2);
            this.imageView3.setImageResource(R.drawable.lenin3);
        }if (text == 12)
        {
            this.imageView.setImageResource(R.drawable.hram);
            this.imageView2.setImageResource(R.drawable.hram2);
            this.imageView3.setImageResource(R.drawable.hram3);
        }


    }
}