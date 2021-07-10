package com.example.speakingsystem;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class set_emergency extends AppCompatActivity {
    public SharedPreferences sharedpreferences;
    EditText contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_emergency);
        contact=(EditText)findViewById(R.id.contact);
        Button set=(Button)findViewById(R.id.set);
        sharedpreferences = getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("contact", contact.getText().toString());
                editor.commit();
                Toast.makeText(set_emergency.this,"Emergency Contact number set successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
