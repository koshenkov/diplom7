package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Weather extends AppCompatActivity {

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        info = findViewById(R.id.info);
        String key = "f9f09493d8afbf6fd3ef053abce0ebc8";
        String key1 = "82b797b6ebc625032318e16f1b42c016";
        String citi = "Bryansk";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" +citi+ "&appid=" +key+ "&units=metric&lang=ru";

        new GetURLData().execute(url);

    }

    class GetURLData extends AsyncTask <String,String,String>{


        protected void onPreExecute(){
            super.onPreExecute();
            info.setText("Ожидайте ...");
        }


        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection con = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(strings[0]);
                con = (HttpURLConnection) url.openConnection();
                con.connect();

                InputStream stream = con.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null)
                    buffer.append(line).append("\n");

                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (con != null)
                    con.disconnect();
                try {
                    if (reader != null)
                        reader.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return null;
        }

        @SuppressLint("SetTextI18n")
        @Override
        protected void onPostExecute(String result){
            super.onPostExecute(result);

            try {
                JSONObject obj = new JSONObject(result);

                info.setText("Температура: " + obj.getJSONObject("main").getDouble("temp") + "°C" + "\nВлажность: "+ obj.getJSONObject("main").getDouble("humidity")+ "%"  + "\nСкорость ветра: "+ obj.getJSONObject("wind").getDouble("speed") + "m/s") ;

            } catch (JSONException e) {
                e.printStackTrace();
            }



        }

    }

}