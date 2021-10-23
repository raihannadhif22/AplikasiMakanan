package com.example.aplikasimakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ModelMenu> mList = new ArrayList<>();
        mList.add(
                new ModelMenu(
                        R.drawable.pecellele,
                        "Pecel Lele",
                        "ikan lele yang digoreng kering dengan minyak lalu disajikan dengan sambal tomat dan lalapan.",
                        (int) 12.000));
        mList.add(
                new ModelMenu(
                        R.drawable.nasgorhongkong,
                        "Nasi Goreng Hongkong",
                        "sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis",
                        (int) 22.000));
        mList.add(
                new ModelMenu(
                        R.drawable.selatsolo,
                        "Selat Solo",
                        "sebuah hidangan yang terdiri dari campuran bistik, salad dan sup.",
                        (int) 18.000));
        mList.add(
                new ModelMenu(
                        R.drawable.mieayam,
                        "Mie Ayam",
                        "Gorengan dengan menggunakan bahan utama kentang yang ditumbuk kemudian dicampur dengan sayuran atau daging.",
                        (int) 11.000));
        mList.add(new ModelMenu(
                R.drawable.mieyamin,
                "Mie Yamin",
                "mi kaki lima yang disajikan dengan sayuran dan topping ayam cincang.",
                8000));
        mList.add(new ModelMenu(
                R.drawable.spagetti,
                "Spagetti Bolognaise",
                "makanan pokok dalam masakan Italia tradisional.",
                (int) 25.000));
        mList.add(new ModelMenu(
                R.drawable.ayam_bakar,
                "Ayam Bakar",
                "hidangan Asia Tenggara Maritim, terutama hidangan Indonesia atau Malaysia, dari ayam yang dipanggang di atas arang..",
                (int) 24.000));

        AdapterMenu mAdapter = new AdapterMenu(this, mList);
        recyclerView.setAdapter(mAdapter);
    }
}