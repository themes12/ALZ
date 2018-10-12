package com.example.thitiphuttaamart.myprojectalzheimers;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz_3 extends AppCompatActivity {

    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_3);

        mFloatingActionButton = findViewById(R.id.btnNextChallenge);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Quiz_3.this, Quiz_4.class);
                startActivity(i);
            }
        });
    }
}
