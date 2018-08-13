package com.example.android.a20180813_threequiz_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private static final String TAG = "Activity3";

    //資料寄放 Intent 答案所需的 key
    public static final String Q3_KEY = "KEY3";

    private TextView m_tv_no;
    private TextView m_tv_question;
    private RadioButton m_radio_a;
    private RadioButton m_radio_b;
    private RadioButton m_radio_c;

    // 紀錄所選的答案
    private CharSequence m_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        // getIntent() 取得傳送來的 Intent
        Intent intent = getIntent();
        // 取得寄放的資料(答案選項)
        CharSequence q1Answer = intent.getCharSequenceExtra(Activity1.Q1_KEY);
        CharSequence q2Answer = intent.getCharSequenceExtra(Activity2.Q2_KEY);

        Log.d(TAG, "q1Answer = " + q1Answer + "q2Answer = " + q2Answer);

        init();
        logIntent();
    }

    private void init(){
        // 宣告
        m_tv_no = findViewById(R.id.textView);
        m_tv_question = findViewById(R.id.textView2);
        m_radio_a = findViewById(R.id.radio_a);
        m_radio_b = findViewById(R.id.radio_b);
        m_radio_c = findViewById(R.id.radio_c);

        // 設定畫面中的題目與答案選項
        // getString( id ) 取得 字串資源
        m_tv_no.setText("3");
        m_tv_question.setText(getString(R.string.question_3));
        m_radio_a.setText(getString(R.string.question_3_radio_a));
        m_radio_b.setText(getString(R.string.question_3_radio_b));
        m_radio_c.setText(getString(R.string.question_3_radio_c));
    }

    private void logIntent(){
        Intent intent = getIntent();
        CharSequence q2Anawer = intent.getCharSequenceExtra(Activity2.Q2_KEY);

    }

    // 處理 RadioButton onClick
    public void clickChoise(View view) {
        switch (view.getId()) {
            case R.id.radio_a:
                m_answer = "A";
                break;
            case R.id.radio_b:
                m_answer = "B";
                break;
            case R.id.radio_c:
                m_answer = "C";
                break;
        }
    }

    public void clickNext (View view){
        Intent intent = getIntent();
        intent.setClass(this, Activity4.class);
        intent.putExtra(Q3_KEY, m_answer);
        startActivity(intent);
        overridePendingTransition(R.anim.push_in, R.anim.push_out);
    }

}
