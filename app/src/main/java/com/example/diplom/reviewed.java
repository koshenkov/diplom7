package com.example.diplom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class reviewed extends AppCompatActivity {

    private ListView ListCheck1;
    private ArrayAdapter<String> adapter;
    private List<String> listDB;

    private List<reviewSive> listTemp;

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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewed);
        init();
        GetDB();
        SetOnclickItem();
    }

    private void init()
    {
        ListCheck1 = findViewById(R.id.ListCheck);
        listDB = new ArrayList<>();
        listTemp = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, listDB);
        ListCheck1.setAdapter(adapter);
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

    private void GetDB()
    {
        ValueEventListener vList = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (listDB.size() > 0) listDB.clear();
                if (listTemp.size() > 0) listTemp.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren())
                {
                    reviewSive user = ds.getValue(reviewSive.class);
                    assert user != null;
                    listDB.add(user.name1);
                    listTemp.add(user);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mDB.addValueEventListener(vList);
    }
    private void SetOnclickItem(){
        ListCheck1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                reviewSive user = listTemp.get(position);
                Intent i = new Intent(reviewed.this,Show_review.class);
                i.putExtra("name",user.name1);
                i.putExtra("review",user.review);
                i.putExtra("date",user.date);
                startActivity(i);
            }
        });
    }

}