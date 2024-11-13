package com.example.noticiaslol;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Noticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_noticias);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Valorant:
                Intent intentValorant = new Intent(this, Valorant.class);
                startActivity(intentValorant);
                break;
            case R.id.Lol:
                Intent intentLOL = new Intent(this, LOL.class);
                startActivity(intentLOL);
                break;
            case R.id.CSGO:
                Intent intentcsgo = new Intent(this, CsGo.class);
                startActivity(intentcsgo);
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/


}