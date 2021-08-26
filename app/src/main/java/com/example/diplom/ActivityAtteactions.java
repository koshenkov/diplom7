package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityAtteactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atteactions);
    }
    public void send(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 1);
        startActivity(intent);
    }
    public void send1(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 2);
        startActivity(intent);
    }
    public void send2(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 3);
        startActivity(intent);
    }
    public void send3(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 4);
        startActivity(intent);
    }
    public void send4(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 5);
        startActivity(intent);
    }
    public void send5(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 6);
        startActivity(intent);
    }
    public void send6(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 7);
        startActivity(intent);
    }
    public void send7(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 8);
        startActivity(intent);
    }
    public void send8(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 9);
        startActivity(intent);
    }
    public void send9(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 10);
        startActivity(intent);
    }
    public void send10(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 11);
        startActivity(intent);
    }
    public void send11(View view) {
        Intent intent = new Intent(ActivityAtteactions.this, ActivityAtteactions1.class);
        intent.putExtra("id", 12);
        startActivity(intent);
    }
}