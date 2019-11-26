package com.smartinovasi.android.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    next = findViewById(R.id.next);
    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent xyz = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(xyz);
            finish();
        }
    });
    }
}
