package com.example.speakingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button play_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        play_button=(Button)findViewById(R.id.play);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(home.this,speak.class);
                startActivity(i1);
               // MediaPlayer ring= MediaPlayer.create(home.this,R.raw.water);
                //ring.start();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Intent i1= new Intent(home.this,set_voice.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(home.this,check_voice.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(home.this,set_emergency.class);
                startActivity(i3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
