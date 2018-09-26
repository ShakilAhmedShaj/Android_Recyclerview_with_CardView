package com.example.shaj.android_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Products> productsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productsList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycleViewID);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productsList = new ArrayList<>();


        productsList.add(
                new Products(
                        1,
                        "Pocophone F1",
                        "Snapdragon 845, 6.18 inches, Li-Po 4000 mAh battery",
                        5.0,
                        25000,
                        R.drawable.poco));

        productsList.add(
                new Products(
                        1,
                        "OnePlus 6",
                        "Snapdragon 845, 6.28 inches, 3300 mAh battery",
                        4.3,
                        35000,
                        R.drawable.one));

        productsList.add(
                new Products(
                        1,
                        "Samsung Galaxy S9",
                        "Snapdragon 845, 5.8 inches, Li-Ion 3000 mAh battery",
                        4.5,
                        80000,
                        R.drawable.samsung));

        productsList.add(
                new Products(
                        1,
                        "Huawei Honor 10",
                        "Hisilicon Kirin 970, 5.84 inches, Li-Po 3400 mAh battery",
                        4.7,
                        35000,
                        R.drawable.honor));

        productsList.add(
                new Products(
                        1,
                        "Huawei P20 Pro",
                        "Hisilicon Kirin 970, 6.1 inches,  Li-Po 4000 mAh battery",
                        4.2,
                        28000,
                        R.drawable.p20));

        productsList.add(
                new Products(
                        1,
                        "Motorola Moto G6",
                        "Snapdragon 450, 5.7 inches,   Li-Ion 3000 mAh battery",
                        4.0,
                        37000,
                        R.drawable.moto));


        ProductAdapter adapter = new ProductAdapter(this, productsList);


        recyclerView.setAdapter(adapter);


    }
}
