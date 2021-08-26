package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    }
    public void send(View view) {
        String phoneNo = "8483743014";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }else {
            Toast.makeText(Number.this, "Enter a phone number", Toast.LENGTH_SHORT).show();
        }
    }
    public void send1(View view) {
        String phoneNo = "84832483201";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }else {
            Toast.makeText(Number.this, "Enter a phone number", Toast.LENGTH_SHORT).show();
        }

    }
    public void send2(View view) {
        String phoneNo = "84832663394";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }else {
            Toast.makeText(Number.this, "Enter a phone number", Toast.LENGTH_SHORT).show();
        }

    }
    public void send3(View view) {
        String phoneNo = "8483599000";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }else {
            Toast.makeText(Number.this, "Enter a phone number", Toast.LENGTH_SHORT).show();
        }

    }
    public void send4(View view) {
        String phoneNo = "101";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }else {
            Toast.makeText(Number.this, "Enter a phone number", Toast.LENGTH_SHORT).show();
        }

    }
}