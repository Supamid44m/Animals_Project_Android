package com.example.animals_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bAnimal, bSeaAnimal,bThai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAnimal = (Button) findViewById(R.id.bShowAnimal);
        bAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnimal();
            }
        });


        bSeaAnimal = (Button) findViewById(R.id.bShowseaAnimal);
        bSeaAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSeaAnimal();
            }
        });

        bThai = (Button)  findViewById(R.id.bShowThai);
        bThai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showThai();
            }
        });

    }

    private void showAnimal(){
        Intent intent = new Intent(MainActivity.this, Animals.class);
        MainActivity.this.startActivity(intent);
    }

    private void showSeaAnimal(){
        Intent intent = new Intent(MainActivity.this, SeaAnimal.class);
        MainActivity.this.startActivity(intent);
    }
    private void showThai(){
        Intent intent = new Intent(MainActivity.this, ThaiAnimal.class);
        MainActivity.this.startActivity(intent);
    }

}