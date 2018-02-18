package com.example.masterluthfi.luthfi_1202150020_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //Daftar Menu Makanan
    private String[] Judul = {"Nasi Goreng Special", "Sate Ayam","Bakso","Mie Goreng Spesial","Soto","Ayam Bakar",
            "Rebusan Kangkung","Pecel Lele","Nasi Pecel","Lele Asam Manis"};
    //Daftar Harga
    private String[] test = {"Rp. 30.000", "Rp. 25.000","Rp. 20.000","Rp. 30.000","Rp. 20.000","Rp. 20.000","Rp. 15.000","Rp. 15.000",
    "Rp. 15.000","Rp. 15.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.nasgor, R.drawable.sate,R.drawable.bakso,R.drawable.miegoreng,R.drawable.soto,
    R.drawable.ayambakar,R.drawable.cahkangkung,R.drawable.pecellele,R.drawable.nasipecel,R.drawable.leleasam};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //Setting Toolbar List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Array List
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);

    }

    //Ambil data, lalu memasangnya pada list yang terhubung dengan Class Adapter
        private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }

}
