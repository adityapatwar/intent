package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tamp extends AppCompatActivity implements View.OnClickListener {

    Button Next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_tamp);
        Next = findViewById (R.id.next);
        Next.setOnClickListener (this);
    }

    @Override
    public void onClick(View view) {
        Intent next = new Intent (tamp.this, finall.class);
        startActivity (next);
    }
}
