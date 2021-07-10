package com.example.speakingsystem;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class check_voice extends AppCompatActivity {
    SharedPreferences sharedpreferences;

    TextView id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,id17,id18,id19,id20,id21,id22,id23,id24,id25,id26,id27,id28,id29,id30,id31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_voice);
        sharedpreferences = getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        //String voice =sharedpreferences.getString(result, "Voice is not set for this code");
        id0=(TextView)findViewById(R.id.id0);
        id1=(TextView)findViewById(R.id.id1);
        id2=(TextView)findViewById(R.id.id2);
        id3=(TextView)findViewById(R.id.id3);
        id4=(TextView)findViewById(R.id.id4);
        id5=(TextView)findViewById(R.id.id5);
        id6=(TextView)findViewById(R.id.id6);
        id7=(TextView)findViewById(R.id.id7);
        id8=(TextView)findViewById(R.id.id8);
        id9=(TextView)findViewById(R.id.id9);
        id10=(TextView)findViewById(R.id.id10);
        id11=(TextView)findViewById(R.id.id11);
        id12=(TextView)findViewById(R.id.id12);
        id13=(TextView)findViewById(R.id.id13);
        id14=(TextView)findViewById(R.id.id14);
        id15=(TextView)findViewById(R.id.id15);
        id16=(TextView)findViewById(R.id.id16);
        id17=(TextView)findViewById(R.id.id17);
        id18=(TextView)findViewById(R.id.id18);
        id19=(TextView)findViewById(R.id.id19);
        id20=(TextView)findViewById(R.id.id20);
        id21=(TextView)findViewById(R.id.id21);
        id22=(TextView)findViewById(R.id.id22);
        id23=(TextView)findViewById(R.id.id23);
        id24=(TextView)findViewById(R.id.id24);
        id25=(TextView)findViewById(R.id.id25);
        id26=(TextView)findViewById(R.id.id26);
        id27=(TextView)findViewById(R.id.id27);
        id28=(TextView)findViewById(R.id.id28);
        id29=(TextView)findViewById(R.id.id29);
        id30=(TextView)findViewById(R.id.id30);
        id31=(TextView)findViewById(R.id.id31);
        id0.setText(sharedpreferences.getString("00000", "NOT SET"));
        id1.setText(sharedpreferences.getString("00001", "NOT SET"));
        id2.setText(sharedpreferences.getString("00010", "NOT SET"));
        id3.setText(sharedpreferences.getString("00011", "NOT SET"));
        id4.setText(sharedpreferences.getString("00100", "NOT SET"));
        id5.setText(sharedpreferences.getString("00101", "NOT SET"));
        id6.setText(sharedpreferences.getString("00110", "NOT SET"));
        id7.setText(sharedpreferences.getString("00111", "NOT SET"));
        id8.setText(sharedpreferences.getString("01000", "NOT SET"));
        id9.setText(sharedpreferences.getString("01001", "NOT SET"));
        id10.setText(sharedpreferences.getString("01010", "NOT SET"));
        id11.setText(sharedpreferences.getString("01011", "NOT SET"));
        id12.setText(sharedpreferences.getString("01100", "NOT SET"));
        id13.setText(sharedpreferences.getString("01101", "NOT SET"));
        id14.setText(sharedpreferences.getString("01110", "NOT SET"));
        id15.setText(sharedpreferences.getString("01111", "NOT SET"));
        id16.setText(sharedpreferences.getString("10000", "NOT SET"));
        id17.setText(sharedpreferences.getString("10001", "NOT SET"));
        id18.setText(sharedpreferences.getString("10010", "NOT SET"));
        id19.setText(sharedpreferences.getString("10011", "NOT SET"));
        id20.setText(sharedpreferences.getString("10100", "NOT SET"));
        id21.setText(sharedpreferences.getString("10101", "NOT SET"));
        id22.setText(sharedpreferences.getString("10110", "NOT SET"));
        id23.setText(sharedpreferences.getString("10111", "NOT SET"));
        id24.setText(sharedpreferences.getString("11000", "NOT SET"));
        id25.setText(sharedpreferences.getString("11001", "NOT SET"));
        id26.setText(sharedpreferences.getString("11010", "NOT SET"));
        id27.setText(sharedpreferences.getString("11011", "NOT SET"));
        id28.setText(sharedpreferences.getString("11100", "NOT SET"));
        id29.setText(sharedpreferences.getString("11101", "NOT SET"));
        id30.setText(sharedpreferences.getString("11110", "NOT SET"));
        id31.setText(sharedpreferences.getString("11111", "NOT SET"));


    }
}
