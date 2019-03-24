package com.example.merve.gk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void harita_ac(View view) {
        Uri istanbulunKoordinatlari= Uri.parse("geo:41.008298,28.978358");
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(istanbulunKoordinatlari);
        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }

    }
}
