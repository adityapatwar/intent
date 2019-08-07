package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button latihan1;
    Button latihan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu);

        latihan1 = findViewById (R.id.btnLatihan1);
        latihan1.setOnClickListener (this);
        latihan2 = findViewById (R.id.btnLatihan2);
        latihan2.setOnClickListener (this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLatihan1:
                Intent latihan1 = new Intent (Menu.this, MainActivity.class);
                startActivity (latihan1);
                break;
            case R.id.btnLatihan2:
                Intent tamp = new Intent (Menu.this, tamp.class);
                startActivity (tamp);
                break;
            default:
                break;

        }

    }
}
