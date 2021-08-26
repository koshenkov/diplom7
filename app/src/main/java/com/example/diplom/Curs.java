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

public class Curs extends AppCompatActivity {

    private TextView curs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curs);

        curs = findViewById(R.id.curs);
        String key = "0f2e59756f1ba9d9a1a5de6eec4b5585";
        String url = "https://currate.ru/api/?get=rates&pairs=USDRUB,EURRUB&key=" +key;

        new GetURL().execute(url);

    }

    class GetURL extends AsyncTask <String,String,String>{


        protected void onPreExecute(){
            super.onPreExecute();
            curs.setText("Ожидайте ...");
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

                curs.setText("USDRUB: " + obj.getJSONObject("data").getDouble("USDRUB") + "\nEURRUB: " + obj.getJSONObject("data").getDouble("EURRUB"));

            } catch (JSONException e) {
                e.printStackTrace();
            }



        }

    }

}