package com.blogbasbas.dasar4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.dasar4.R;

/**
 * Created by User on 14/07/2018.
 */


//fungsi adapter ad/ class yang memanage item2 bisa pada listview/recyclerview/spinner
public class AdapterListviewBuah extends BaseAdapter{
    //variabel
    Context context;
    String namaBuah [];
    int gambarBuah[];

    //buat constructor


    public AdapterListviewBuah(Context context, String[] namaBuah, int[] gambarBuah) {
        this.context = context;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    @Override
    public int getCount() {
        return namaBuah.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posisition, View view, ViewGroup viewGroup) {

        //buat object utk inflater
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.item_buah,null);

        //inisialisasi widget dalam layout item buah
        TextView tvNamaBuah = (TextView)view.findViewById(R.id.tv_namabuah_itemlistview);
        ImageView imgNamaBuah = (ImageView)view.findViewById(R.id.img_namabuah_itemlistview);

        //set setiap item
        tvNamaBuah.setText(namaBuah[posisition]);
        imgNamaBuah.setImageResource(gambarBuah[posisition]);

        




        return view;
    }
}
