package com.semuaonline.desabangunmulyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Home extends AppCompatActivity {
    private CardView benner_profil, Benner_visi, banner_sejarah, banner_umur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        benner_profil   = findViewById(R.id.banner_profil);
        Benner_visi     = findViewById(R.id.banner_visi);
        banner_sejarah  = findViewById(R.id.banner_sejarah);
        banner_umur     = findViewById(R.id.banner_umur);

        benner_profil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (getApplicationContext (),benner_profil.class));
            }
        });

        Benner_visi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (getApplicationContext (),Benner_visi.class));
            }
        });

        banner_sejarah.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (getApplicationContext (),banner_sejarah.class));
            }
        });

        banner_umur.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (getApplicationContext (),banner_umum.class));
            }
        });

    }

    public void buka(View view) {
        Intent intent;
        intent = new Intent(Home.this,all_info_update.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent;
        intent = new Intent(Home.this,profil_desa.class);
        startActivity(intent);
    }

    public void data_penduduk(View view) {
        Intent intent;
        intent = new Intent(Home.this,data_penduduk.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent;
        intent = new Intent(Home.this,galeri.class);
        startActivity(intent);
    }

    public void surat(View view) {
        Intent intent;
        intent = new Intent(Home.this,surat.class);
        startActivity(intent);
    }

    public void belanja(View view) {
        Intent intent;
        intent = new Intent(Home.this,belanja.class);
        startActivity(intent);
    }

    public void suratbawah(View view) {
        Intent intent;
        intent = new Intent(Home.this,surat.class);
        startActivity(intent);
    }

    public void contact(View view) {
        Intent intent;
        intent = new Intent(Home.this,contact.class);
        startActivity(intent);
    }

    public void aparatur(View view) {
        Intent intent;
        intent = new Intent(Home.this,aparatur.class);
        startActivity(intent);
    }

    public void lokasi(View view) {
        Intent intent;
        intent = new Intent(Home.this,MapsActivity.class);
        startActivity(intent);
    }

    public void produk_desa(View view) {
        Intent intent;
        intent = new Intent(Home.this,produk_desa.class);
        startActivity(intent);
    }

    public void transparasi(View view) {
        Intent intent;
        intent = new Intent(Home.this,Transparasi.class);
        startActivity(intent);
    }

    public void apsen(View view) {
        Intent intent;
        intent = new Intent(Home.this,absen.class);
        startActivity(intent);

    }
}




