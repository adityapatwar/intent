package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finall extends AppCompatActivity implements View.OnClickListener {
    Button end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_finall);
        end = findViewById (R.id.btn_Finish);
        end.setOnClickListener (this);
    }

    @Override
    public void onClick(View view) {
        Intent end = new android.content.Intent (finall.this, Menu.class);
        startActivity (end);
    }
}
