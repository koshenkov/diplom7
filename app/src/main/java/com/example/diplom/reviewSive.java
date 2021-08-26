package com.example.diplom;

public class reviewSive {
    public String id1,name1,review,date,key;
    public int idreview;

    public reviewSive()
    {

    }

    public reviewSive(String id1,int idreview, String name1, String review, String date,String key) {
        this.id1 = id1;
        this.idreview = idreview;
        this.name1 = name1;
        this.review = review;
        this.date = date;
        this.key = key;
    }
}