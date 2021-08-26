package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class review extends AppCompatActivity {

    private EditText Name1,review2;

    private DatabaseReference mDB;

    private String review_KEY1 = Const.review_KEY1;
    private String review_KEY2 = Const.review_KEY2;
    private String review_KEY3 = Const.review_KEY3;
    private String review_KEY4 = Const.review_KEY4;
    private String review_KEY5 = Const.review_KEY5;
    private String review_KEY6 = Const.review_KEY6;
    private String review_KEY7 = Const.review_KEY7;
    private String review_KEY8 = Const.review_KEY8;
    private String review_KEY9 = Const.review_KEY9;
    private String review_KEY10 = Const.review_KEY10;
    private String review_KEY11 = Const.review_KEY11;
    private String review_KEY12 = Const.review_KEY12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);


        Name1 = (EditText) findViewById(R.id.Name);

        review2 = (EditText) findViewById(R.id.review2);

        Bundle extras = getIntent().getExtras();
        int text = extras.getInt("id");
        if (text == 1)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY1);
        }
        if (text == 2)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY2);
        }
        if (text == 3)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY3);
        }
        if (text == 4)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY4);
        }
        if (text == 5)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY5);
        }
        if (text == 6)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY6);
        }
        if (text == 7)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY7);
        }
        if (text == 8)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY8);
        }
        if (text == 9)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY9);
        }
        if (text == 10)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY10);
        }
        if (text == 11)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY11);
        }
        if (text == 12)
        {
            mDB = FirebaseDatabase.getInstance().getReference(review_KEY12);
        }

    }
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
    public void sendReview(View view) {
        String id = mDB.getKey();
        String key = mDB.push().getKey();
        String Name = Name1.getText().toString();
        String Review = review2.getText().toString();
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
        Bundle extras = getIntent().getExtras();
        int text = extras.getInt("id");
        reviewSive NewreviewSive = new reviewSive(id,text,Name,Review,dateText,key);
        if (isOnline()) {

            if (!TextUtils.isEmpty(Name) && !TextUtils.isEmpty(Review)) {
                mDB.push().setValue(NewreviewSive);
                Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show();
                Name1.setText("");
                review2.setText("");
            } else {
                Toast.makeText(this, "Пустое поле", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "Отсутствует поключение к интеренету", Toast.LENGTH_SHORT).show();
        }


    }
}