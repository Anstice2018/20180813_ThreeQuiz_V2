package com.example.android.a20180813_threequiz_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Intent intent = getIntent();
        TextView ans = findViewById(R.id.textView2);

        CharSequence q1Answer = intent.getCharSequenceExtra(Activity1.Q1_KEY);
        CharSequence q2Answer = intent.getCharSequenceExtra(Activity2.Q2_KEY);
        CharSequence q3Answer = intent.getCharSequenceExtra(Activity3.Q3_KEY);

        ans.setText(q1Answer + "\n" + q2Answer + "\n" + q3Answer);


    }
}
