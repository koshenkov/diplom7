package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Show_review extends AppCompatActivity {

    private TextView tvName,tvReview,tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_review);
        init();
        GetIntent();
    }
    private void init()
    {
        tvName = findViewById(R.id.textView18);
        tvReview = findViewById(R.id.textView19);
        tvDate = findViewById(R.id.textView20);
    }
    private void GetIntent()
    {
        Intent i = getIntent();
        if (i != null)
        {
            tvName.setText(i.getStringExtra("name"));
            tvReview.setText(i.getStringExtra("review"));
            tvDate.setText(i.getStringExtra("date"));
        }
    }
}