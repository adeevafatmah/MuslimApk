package com.adeevafatmah.d6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mainDoa extends AppCompatActivity {
    private TextView doaMasukWC, doaKeluarWC, doaSebelumMakan, doaSetelahMakan,
            doaBukaPuasa, doaBangunTidur, doaDalamPerjalanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        doaMasukWC = (TextView)findViewById(R.id.doaMasukWC);
        doaKeluarWC= (TextView)findViewById(R.id.doaKeluarWC);
        doaSebelumMakan= (TextView)findViewById(R.id.doaSebelumMakan);
        doaSetelahMakan= (TextView)findViewById(R.id.doaSetelahMakan);
        doaBukaPuasa= (TextView)findViewById(R.id.doaBukaPuasa);
        doaBangunTidur= (TextView)findViewById(R.id.doaBangunTidur);
        doaDalamPerjalanan= (TextView)findViewById(R.id.doaDalamPerjalanan);

        doaMasukWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaMasukWC.class);
                startActivity(intent);
            }
        });

        doaKeluarWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaKeluarWC.class);
                startActivity(intent);
            }
        });

        doaSebelumMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaSebelumMakan.class);
                startActivity(intent);
            }
        });

        doaSetelahMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaSetelahMakan.class);
                startActivity(intent);
            }
        });

        doaBukaPuasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaBukaPuasa.class);
                startActivity(intent);
            }
        });

        doaBangunTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaBangunTidur.class);
                startActivity(intent);
            }
        });

        doaDalamPerjalanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaDalamPerjalanan.class);
                startActivity(intent);
            }
        });

    }
}
