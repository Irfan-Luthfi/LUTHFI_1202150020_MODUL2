package com.example.masterluthfi.luthfi_1202150020_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private TextInputLayout a,b;
    private Spinner c;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //Setting Tollbar Dine In
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Untuk Spinner

        c = (Spinner) findViewById(R.id.nomeja);

        //Manggil Array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (c != null){
            c.setAdapter(adapter);
        }

    }

    public void pilihpesanan(View view) {

        //Inisiasi TextInputLayot

        a = (TextInputLayout) findViewById(R.id.nama);

        //String untuk Spinner
        String test = c.getSelectedItem().toString();

        //Jika spinner null
        if (a ==null){
            Toast.makeText(this,"Silahkan Diisi",Toast.LENGTH_LONG).show();
        }
        //Jika pilih Meja 1
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //Jika pilih Meja 2
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //Jika pilih Meja 3
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //Jika pilih Meja 4
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //Jika pilih Meja 5
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }


        //Kirim Nama
        Intent a = new Intent(DineIn.this,ListPesanan.class);
        startActivity(a);

    }
}
