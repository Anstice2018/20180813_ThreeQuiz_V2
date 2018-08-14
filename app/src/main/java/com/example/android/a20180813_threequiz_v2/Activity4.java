package com.example.android.a20180813_threequiz_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    private TextView ans;
    private CharSequence q1Answer;
    private CharSequence q2Answer;
    private CharSequence q3Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ans = findViewById(R.id.textView2);

        Intent intent = getIntent();
        q1Answer = intent.getCharSequenceExtra(Activity1.Q1_KEY);
        q2Answer = intent.getCharSequenceExtra(Activity2.Q2_KEY);
        q3Answer = intent.getCharSequenceExtra(Activity3.Q3_KEY);

        StringBuilder result = new StringBuilder();
        result.append("1. ").append(q1Answer).append("\n")
                .append("2. ").append(q2Answer).append("\n")
                .append("3. ").append(q3Answer);
        ans = findViewById(R.id.textView2);
        ans.setText(result);

    }



    public void clickBack (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_in, R.anim.push_out);
    }
}
