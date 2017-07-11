package com.example.cj.testintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by CJ on 2017/7/11.
 */

public class SecondActivity extends Activity {
    private Button btn;
    private EditText input;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        input = (EditText) findViewById(R.id.second_et);
        btn = (Button) findViewById(R.id.second_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                //将数据放入intent
                //i.putExtra("info", input.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("info", input.getText().toString());
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
