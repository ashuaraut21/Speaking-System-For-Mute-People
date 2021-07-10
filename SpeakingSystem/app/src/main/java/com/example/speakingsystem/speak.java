package com.example.speakingsystem;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;

public class speak extends AppCompatActivity {
    Button stop,start;
    Timer t = new Timer();
    SharedPreferences sharedpreferences;
    TextToSpeech t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
        stop=(Button)findViewById(R.id.stop);
        sharedpreferences = getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.cancel();
                Toast.makeText(speak.this,"STOP SPEAKING",Toast.LENGTH_LONG).show();

            }
        });


        //Declare the timer

        //Set the schedule function and rate
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                LedOnOff gettrans = new LedOnOff();
                String url1 = "http://mahavidyalay.in/AcademicDevelopment/ServerDemo/ShowLed2.php";
                gettrans.execute(url1);
            }
            }, 0,5000);


    }
    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    private class LedOnOff extends AsyncTask<String, Integer, String> {
        String out="";
        int count=0;
        @Override
        protected String doInBackground(String... geturl) {
            try{
                HttpClient http=new DefaultHttpClient();
                HttpPost http_get= new HttpPost(geturl[0]);
                HttpResponse response=http.execute(http_get);
                HttpEntity http_entity=response.getEntity();
                BufferedReader br= new BufferedReader(new InputStreamReader(http_entity.getContent()));
                out = br.readLine();

            }catch (Exception e){

                out= e.toString();
            }
            return out;
        }

        @Override
        protected void onPreExecute() {


            super.onPreExecute();
        }
        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(speak.this, ""+result, Toast.LENGTH_LONG).show();
            String voice =sharedpreferences.getString(result, "Voice is not set for this code");
            if(result.contentEquals("00000")){
                SmsManager smgr = SmsManager.getDefault();
                smgr.sendTextMessage(sharedpreferences.getString("contact", "7709705950"),null,"IT's Emergency",null,null);
            }
            t1.speak(voice, TextToSpeech.QUEUE_FLUSH, null);





        }
    }
}
