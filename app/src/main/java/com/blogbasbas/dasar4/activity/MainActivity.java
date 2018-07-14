package com.blogbasbas.dasar4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.blogbasbas.dasar4.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
//package funsinya , untuk managefile2 biar lebih terorgansir


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_mengenal_buah)
    Button btnMengenalBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_mengenal_buah)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this,
                                ListBuahActivity.class));
    }
}
