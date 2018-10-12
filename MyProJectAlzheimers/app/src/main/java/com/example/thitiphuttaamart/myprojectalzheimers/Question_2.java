package com.example.thitiphuttaamart.myprojectalzheimers;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question_2 extends AppCompatActivity {

    private Button btn;
    private Button btn1;

    private int mScore = 1;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);

        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button2);
        score = findViewById(R.id.score);

        Bundle bundle = getIntent().getExtras();
        int text = bundle.getInt("Score: ");

        TextView textData = (TextView)findViewById(R.id.score);
        textData.setText("Score : " + text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mScore++;
                Intent i = new Intent(Question_2.this, Question_3.class);
                startActivity(i);
                Intent intent = new Intent(Question_2.this, Question_3.class);
                intent.putExtra("Score", mScore);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Question_2.this).create();
                alertDialog.setTitle("Incorrect");
                alertDialog.setMessage("Click ok!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Question_2.this, Question_3.class);
                                startActivity(i);
                            }
                        });
                alertDialog.show();
            }
        });
    }
}
