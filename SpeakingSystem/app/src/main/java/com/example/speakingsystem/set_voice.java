package com.example.speakingsystem;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class set_voice extends AppCompatActivity  {
    Button set;
    EditText text;
    public SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_voice);
        text=(EditText)findViewById(R.id.text);
        set=(Button)findViewById(R.id.set);
        sharedpreferences = getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("00000", "Emergency Emergency Emergency");
        editor.commit();
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.code, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code= spinner.getSelectedItem().toString();
                String text1=text.getText().toString();
                if(text1.length()>0) {
                    if(code.length()>0) {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(code, text1);
                        editor.commit();
                        Toast.makeText(set_voice.this,"Voice set For code :"+code,Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(set_voice.this,"Select code",Toast.LENGTH_LONG).show();
                        spinner.requestFocus(20);

                    }
                }else{
                    text.setError("Please Enter Voice for the Code");
                    text.requestFocus(20);
                }

            }
        });

    }

}
