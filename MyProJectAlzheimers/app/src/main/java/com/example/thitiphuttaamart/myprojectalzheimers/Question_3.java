package com.example.thitiphuttaamart.myprojectalzheimers;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question_3 extends AppCompatActivity {

    private RadioButton btn;
    private RadioButton btn1;
    private RadioButton btn2;
    private RadioButton btn3;

    private int mScore = 0;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);

        btn = findViewById(R.id.radioButton);
        btn1 = findViewById(R.id.radioButton2);
        btn2 = findViewById(R.id.radioButton3);
        btn3 = findViewById(R.id.radioButton4);
        score = findViewById(R.id.score);

        Bundle bundle = getIntent().getExtras();
        int text = bundle.getInt("Score");

        TextView textData = (TextView)findViewById(R.id.score);
        textData.setText("Score : " + text);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mScore++;
                Intent i = new Intent(Question_3.this, Question_4.class);
                startActivity(i);
                Intent intent = new Intent(Question_3.this, Question_4.class);
                intent.putExtra("Score", mScore);
                startActivity(intent);

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Question_3.this).create();
                alertDialog.setTitle("Incorrect");
                alertDialog.setMessage("Click ok!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Question_3.this, Question_4.class);
                                startActivity(i);
                            }
                        });
                alertDialog.show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Question_3.this).create();
                alertDialog.setTitle("Incorrect");
                alertDialog.setMessage("Click ok!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Question_3.this, Question_4.class);
                                startActivity(i);
                            }
                        });
                alertDialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Question_3.this).create();
                alertDialog.setTitle("Incorrect");
                alertDialog.setMessage("Click ok!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Question_3.this, Question_4.class);
                                startActivity(i);
                            }
                        });
                alertDialog.show();
            }
        });
    }
}
