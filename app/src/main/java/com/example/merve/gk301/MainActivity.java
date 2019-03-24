package com.example.merve.gk301;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fotovideocek (View view){
        Intent i = new Intent(MainActivity.this,FotografVideoActivity.class);
        startActivity(i);
    }

    public void smsGonder(View view) {
        Intent sms = new Intent (MainActivity.this,SmsActivity.class);
        startActivity(sms);
    }

    public void webac(View view) {
        Intent web = new Intent(MainActivity.this,WebActivity.class);
    }

    public void haritaya_git(View view) {
        Intent harita = new Intent(MainActivity.this,MapActivity.class);
        startActivity(harita);
    }
}
