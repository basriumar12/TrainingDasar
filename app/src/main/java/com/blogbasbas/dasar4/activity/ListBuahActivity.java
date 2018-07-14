package com.blogbasbas.dasar4.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.blogbasbas.dasar4.R;
import com.blogbasbas.dasar4.adapter.AdapterListviewBuah;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListBuahActivity extends AppCompatActivity {

    @BindView(R.id.lv_mengenal_buah)
    ListView lvMengenalBuah;

    String namaBuah[] = {"Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis",
            "Strawbery"};
    int gambarBuah[] = {R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry};
    int suaraBuah[] = {R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry};
    AdapterListviewBuah adapterListviewBuah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_buah);
        ButterKnife.bind(this);

     //inisialisasi adapter
        adapterListviewBuah = new AdapterListviewBuah(this,
                                                        namaBuah,
                                                        gambarBuah);

        // set widget listview dengan object adapter
        lvMengenalBuah.setAdapter(adapterListviewBuah);
    }
}
