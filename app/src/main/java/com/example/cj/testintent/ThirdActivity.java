package com.example.cj.testintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by CJ on 2017/7/11.
 */

public class ThirdActivity extends Activity {
    private TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = (TextView) findViewById(R.id.third_tv);
        if (getIntent() != null) {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            String info = bundle.getString("info");
            //String info = intent.getStringExtra("info");
            tv.setText(info);
        }
    }
}
