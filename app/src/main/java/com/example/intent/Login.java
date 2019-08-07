package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button keMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);

        keMenu = findViewById (R.id.tombol_login);
        keMenu.setOnClickListener (this);


    }

    @Override
    public void onClick(View view) {
        Intent menu = new android.content.Intent (Login.this, Menu.class);
        startActivity (menu);
    }
}
