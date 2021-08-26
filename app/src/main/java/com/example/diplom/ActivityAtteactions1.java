package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ActivityAtteactions1 extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atteactions1);

        this.textView1 = (TextView) this.findViewById(R.id.textView11);
        this.textView2 = (TextView) this.findViewById(R.id.textView);


        Bundle extras = getIntent().getExtras();
        int text = extras.getInt("id");
        if (text == 1)
        {
            this.textView1.setText(R.string.name1);
            this.textView2.setText(R.string.textAttec);
        }
        if (text == 2)
        {
            this.textView1.setText(R.string.name2);
            this.textView2.setText(R.string.textAttec1);
        }
        if (text == 3)
        {
            this.textView1.setText(R.string.name3);
            this.textView2.setText(R.string.textAttec2);
        }
        if (text == 4)
        {
            this.textView1.setText(R.string.name4);
            this.textView2.setText(R.string.textAttec4);
        }
        if (text == 5)
        {
            this.textView1.setText(R.string.name5);
            this.textView2.setText(R.string.textAttec5);
        }
        if (text == 6)
        {
            this.textView1.setText(R.string.name6);
            this.textView2.setText(R.string.textAttec6);
        }
        if (text == 7)
        {
            this.textView1.setText(R.string.name7);
            this.textView2.setText(R.string.textAttec7);
        }
        if (text == 8)
        {
            this.textView1.setText(R.string.name8);
            this.textView2.setText(R.string.textAttec8);
        }
        if (text == 9)
        {
            this.textView1.setText(R.string.name9);
            this.textView2.setText(R.string.textAttec9);
        }
        if (text == 10)
        {
            this.textView1.setText(R.string.name10);
            this.textView2.setText(R.string.textAttec10);
        }
        if (text == 11)
        {
            this.textView1.setText(R.string.name11);
            this.textView2.setText(R.string.textAttec11);
        }
        if (text == 12)
        {
            this.textView1.setText(R.string.name12);
            this.textView2.setText(R.string.textAttec12);
        }
    }
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
    public void send(View view) {
        if (isOnline()) {
            Intent intent = new Intent(ActivityAtteactions1.this, review.class);
            Bundle extras = getIntent().getExtras();
            int text = extras.getInt("id");
            intent.putExtra("id", text);
            startActivity(intent);
        }


    }
    public void send1(View view) {
        if (isOnline()) {

            Intent intent = new Intent(ActivityAtteactions1.this, reviewed.class);
            Bundle extras = getIntent().getExtras();
            int text = extras.getInt("id");
            intent.putExtra("id", text);
            startActivity(intent);
        }
    }
    public void send4(View view) {
        if (isOnline()) {

            Intent intent = new Intent(ActivityAtteactions1.this, Image.class);
            Bundle extras = getIntent().getExtras();
            int text = extras.getInt("id");
            intent.putExtra("id", text);
            startActivity(intent);
        }
    }

    public void send2(View view) {

        if (isOnline()) {
            Intent intent = new Intent(ActivityAtteactions1.this, AdminAck.class);
            Bundle extras = getIntent().getExtras();
            int text = extras.getInt("id");
            intent.putExtra("id", text);
            startActivity(intent);
        }

    }
    public void send3(View view) {
        if (isOnline()) {
            // Создаем интент для построения маршрута
            Intent intent = new Intent("ru.yandex.yandexnavi.action.BUILD_ROUTE_ON_MAP");
            intent.setPackage("ru.yandex.yandexnavi");

            PackageManager pm = getPackageManager();
            List<ResolveInfo> infos = pm.queryIntentActivities(intent, 0);

// Проверяем, установлен ли Яндекс.Навигатор
            if (infos == null || infos.size() == 0) {
                // Если нет - будем открывать страничку Навигатора в Google Play
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=ru.yandex.yandexnavi"));
            } else {
                Bundle extras = getIntent().getExtras();
                int text = extras.getInt("id");
                if (text == 1) {
                    intent.putExtra("lat_to", 53.268692);
                    intent.putExtra("lon_to", 34.364396);
                }
                if (text == 2) {
                    intent.putExtra("lat_to", 53.234680);
                    intent.putExtra("lon_to", 34.353804);
                }
                if (text == 3) {
                    intent.putExtra("lat_to", 53.198463);
                    intent.putExtra("lon_to", 34.529098);
                }
                if (text == 4) {
                    intent.putExtra("lat_to", 53.245303);
                    intent.putExtra("lon_to", 34.359987);
                }
                if (text == 5) {
                    intent.putExtra("lat_to", 53.242401);
                    intent.putExtra("lon_to", 34.362271);
                }
                if (text == 6) {
                    intent.putExtra("lat_to", 53.245027);
                    intent.putExtra("lon_to", 34.359767);
                }
                if (text == 7) {
                    intent.putExtra("lat_to", 53.244999);
                    intent.putExtra("lon_to", 34.373609);
                }
                if (text == 8) {
                    intent.putExtra("lat_to", 53.234122);
                    intent.putExtra("lon_to", 34.597308);
                }
                if (text == 9) {
                    intent.putExtra("lat_to", 53.205874);
                    intent.putExtra("lon_to", 34.328750);
                }
                if (text == 10) {
                    intent.putExtra("lat_to", 53.311030);
                    intent.putExtra("lon_to", 34.311646);
                }
                if (text == 11) {
                    intent.putExtra("lat_to", 53.261845);
                    intent.putExtra("lon_to", 34.410187);
                }
                if (text == 12) {
                    intent.putExtra("lat_to", 53.249620);
                    intent.putExtra("lon_to", 34.372314);
                }
            }

// Запускаем нужную Activity
            startActivity(intent);
        }
    }
}