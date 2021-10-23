package com.example.aplikasimakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMenuActivity extends AppCompatActivity {

    private TextView tvTitle, tvDesc, tvHarga;
    private ImageView imageView;
    private ModelMenu modelMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvTitle = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);
        tvHarga = findViewById(R.id.tvHarga);
        imageView = findViewById(R.id.imageView);

        modelMenu = getIntent().getExtras().getParcelable("extra_list");
        if (modelMenu != null){
            tvTitle.setText(modelMenu.getNAMA_MAKANAN());
            tvDesc.setText(modelMenu.getDESC_MAKANAN());
            tvHarga.setText("Rp. "+modelMenu.getHARGA_MAKANAN());
            Glide.with(this).load(modelMenu.getIMAGE_MAKANAN()).into(imageView);
            getSupportActionBar().setTitle(modelMenu.getNAMA_MAKANAN());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

