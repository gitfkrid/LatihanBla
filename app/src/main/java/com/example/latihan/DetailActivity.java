package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvJudul, tvArtikel;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
    }

    public void init(){
        tvJudul = findViewById(R.id.tvJudul);
        tvArtikel = findViewById(R.id.tvArtikel);
        image = findViewById(R.id.image);

        //get data from intent
        String judul = getIntent().getStringExtra("id");
        String artikel = getIntent().getStringExtra("content");
        String image = getIntent().getStringExtra("image");

        //set data to view
        tvJudul.setText(judul);
        tvArtikel.setText(artikel);
        this.image.setImageResource(this.image.getContext().getResources().getIdentifier(image, "drawable", this.image.getContext().getPackageName()));
    }
}


