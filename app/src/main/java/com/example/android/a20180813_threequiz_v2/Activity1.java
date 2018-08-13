package com.example.android.a20180813_threequiz_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    //資料寄放 Intent 答案所需的 key
    public static final String Q1_KEY = "KEY1";

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
        setContentView(R.layout.activity_1);

        init();
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
        m_tv_no.setText("1");
        m_tv_question.setText(getString(R.string.question_1));
        m_radio_a.setText(getString(R.string.question_1_radio_a));
        m_radio_b.setText(getString(R.string.question_1_radio_b));
        m_radio_c.setText(getString(R.string.question_1_radio_c));
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
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(Q1_KEY, m_answer);
        startActivity(intent);
        overridePendingTransition(R.anim.push_in, R.anim.push_out);
    }
}
