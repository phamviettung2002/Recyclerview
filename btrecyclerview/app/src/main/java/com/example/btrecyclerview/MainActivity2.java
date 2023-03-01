package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv1, tv2;

    Button btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.img);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        btback = findViewById(R.id.btback);

        Intent intent= getIntent();
        String name = intent.getExtras().getString("name");
        int image = intent.getExtras().getInt("image");
        String describe = intent.getExtras().getString("describe");

        tv1.setText(name);
        tv2.setText(describe);
        img.setImageResource(image);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}