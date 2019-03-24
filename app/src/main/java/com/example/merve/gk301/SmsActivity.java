package com.example.merve.gk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    public void smsAt(View view) {

        EditText mesajEt=(EditText)findViewById(R.id.editText);
        EditText telefonEt=(EditText)findViewById(R.id.phone);

        String mesaj=mesajEt.getText().toString();
        String tel=telefonEt.getText().toString();

        Uri uri= Uri.parse("smsto:"+tel);

        Intent i=new Intent(Intent.ACTION_SENDTO,uri);
        i.putExtra("sms_body",mesaj);
        startActivity(i);

    }
}
