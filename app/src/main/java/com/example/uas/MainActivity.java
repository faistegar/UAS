package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) { klikok();}
        });
    }
    public void klikok() {
        Intent halamanBaru = new Intent(MainActivity.this, OKE.class);
        startActivity(halamanBaru);
    }
}