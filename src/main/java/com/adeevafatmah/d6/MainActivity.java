package com.adeevafatmah.d6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView produkHalal, jadwalSholat, doaHarian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produkHalal = (TextView)findViewById(R.id.produkHalal);
        jadwalSholat = (TextView)findViewById(R.id.jadwalSholat);
        doaHarian = (TextView)findViewById(R.id.doaHarian);

        produkHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainHalal.class);
                startActivity(intent);
            }
        });

        jadwalSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainSholat.class);
                startActivity(intent);
            }
        });

        doaHarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainDoa.class);
                startActivity(intent);
            }
        });

    }
}

