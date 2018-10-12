package com.example.thitiphuttaamart.myprojectalzheimers;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    private FloatingActionButton mFloatingActionButton;
    final Random rnd = new Random();
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mFloatingActionButton = findViewById(R.id.btnNextChallenge);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Quiz.this, Quiz_2.class);
                startActivity(i);
            }
        });
    }
}
