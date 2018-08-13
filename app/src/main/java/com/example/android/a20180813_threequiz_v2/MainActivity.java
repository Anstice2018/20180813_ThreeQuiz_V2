package com.example.android.a20180813_threequiz_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickNext (View view){
        Intent intent = new Intent(this,Activity1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_in, R.anim.push_out);
    }

}
