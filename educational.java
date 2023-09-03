package com.example.news_hunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class educational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);



            Button button5=findViewById(R.id.button5);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(educational.this,iit.class);
                    startActivity(intent);
                }
            });
        imgButton = (ImageButton) findViewById(R.id.imageButton8);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(educational.this,iit.class);
                startActivity(intent);


            }
        });
        Button button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(educational.this,ap.class);
                startActivity(intent);
            }
        });
        imgButton = (ImageButton) findViewById(R.id.imageButton15);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(educational.this,ap.class);
                startActivity(intent);


            }
        });
        Button button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(educational.this,percentile.class);
                startActivity(intent);
            }
        });
        imgButton = (ImageButton) findViewById(R.id.imageButton14);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(educational.this,percentile.class);
                startActivity(intent);


            }
        });
        Button button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(educational.this,percentile.class);
                startActivity(intent);
            }
        });
        imgButton = (ImageButton) findViewById(R.id.imageButton16);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(educational.this,university.class);
                startActivity(intent);


            }
        });

        Button button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(educational.this,jharkhand.class);
                startActivity(intent);
            }
        });
        imgButton = (ImageButton) findViewById(R.id.imageButton17);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(educational.this,jharkhand.class);
                startActivity(intent);


            }
        });


    }
    ImageButton imgButton;
}