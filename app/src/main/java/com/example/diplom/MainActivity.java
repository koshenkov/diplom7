package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityBryansk.class);
        startActivity(intent);
    }
    public void sendMessage1(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityAtteactions.class);
        startActivity(intent);
    }
    public void sendMessage2(View view) {
        if (isOnline()) {
            Intent intent = new Intent(MainActivity.this, Weather.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Отсутствует поключение к интеренету", Toast.LENGTH_SHORT).show();
        }

    }
    public void sendMessage3(View view) {
        if (isOnline()) {
            Intent intent = new Intent(MainActivity.this, Curs.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Отсутствует поключение к интеренету", Toast.LENGTH_SHORT).show();
        }
        

    }
    public void sendMessage4(View view) {
        Intent intent = new Intent(MainActivity.this, Number.class);
        startActivity(intent);
    }
}