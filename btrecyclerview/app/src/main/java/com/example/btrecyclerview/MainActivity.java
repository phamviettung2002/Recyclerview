package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model("SQL", "Hệ quản trị cơ sở dữ liệu", R.drawable.sql ));
        arrayList.add(new Model("Java", "Ngôn ngữ lập trình Java", R.drawable.java ));
        arrayList.add(new Model("CShape", "Ngôn ngữ lập trình C Shape", R.drawable.cshape ));
        arrayList.add(new Model("Python", "Ngôn ngữ lập trình Python", R.drawable.python ));
        arrayList.add(new Model("SQL", "Hệ quản trị cơ sở dữ liệu", R.drawable.sql ));
        arrayList.add(new Model("Java", "Ngôn ngữ lập trình Java", R.drawable.java ));
        arrayList.add(new Model("CShape", "Ngôn ngữ lập trình C Shape", R.drawable.cshape ));
        arrayList.add(new Model("Python", "Ngôn ngữ lập trình Python", R.drawable.python ));


        ModelRecycelrView modelRecycelrView = new ModelRecycelrView(this, arrayList);
        recyclerView.setAdapter(modelRecycelrView);
    }
}