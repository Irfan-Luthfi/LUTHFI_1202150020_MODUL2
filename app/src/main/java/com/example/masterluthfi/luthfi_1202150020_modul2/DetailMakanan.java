package com.example.masterluthfi.luthfi_1202150020_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    private TextView a,b,f;
    private ImageView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //melakukan insiasi pada id nya

        a = (TextView) findViewById(R.id.namamakanan);

        b = (TextView) findViewById(R.id.harga);

        f = (TextView) findViewById(R.id.komposisi);

        d = (ImageView) findViewById(R.id.gambar);

        //Setting Toolbar List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_detail);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent c = getIntent();

        String menu = c.getStringExtra("Nama");
        String hrga = c.getStringExtra("Harga");
        String kmposisi= c.getStringExtra("Komposisi");
        Integer gmbr = c.getIntExtra("Gambar",0);

        //Set Text
        a.setText(menu);
        b.setText(hrga);
        f.setText(kmposisi);
        d.setImageResource(gmbr);


    }
}
