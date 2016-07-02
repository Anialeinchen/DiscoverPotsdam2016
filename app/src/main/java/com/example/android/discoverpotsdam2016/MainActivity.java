package com.example.android.discoverpotsdam2016;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.GridView;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public static int[] places_resourceDrawable = {R.drawable.donuts, R.drawable.eisfrau, R.drawable.waschbar, R.drawable.kuze, R.drawable.pub};
    public static String[] array_places = {"a", "b", "c", "d", "e"};
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getBaseContext();
        Toast welcome = Toast.makeText(context, R.string.toast_message, Toast.LENGTH_SHORT);
        welcome.show();


        GridView gridview = (GridView) findViewById(R.id.gridView1);
        gridview.setAdapter(new ImageAdapter(this));
        gv = (GridView) findViewById(R.id.gridView1);
    }

    }


