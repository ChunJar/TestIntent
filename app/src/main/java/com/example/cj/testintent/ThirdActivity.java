package com.example.cj.testintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by CJ on 2017/7/11.
 */

public class ThirdActivity extends Activity {
    private TextView tv;
    private Button btn;
    private String info;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btn = (Button) findViewById(R.id.third_btn);
        tv = (TextView) findViewById(R.id.third_tv);
        if (getIntent() != null) {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            info = bundle.getString("info");
            //String info = intent.getStringExtra("info");
            tv.setText(info);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeCall(info);
            }
        });
    }

    protected void takeCall(String info) {
        Intent intent = new Intent();
        //实现隐式跳转
        //Uri.parse是将一个字符串类型转化成Uri类型的方法
        //跳转到系统拨号界面
        //intent.setData(Uri.parse("tel://" + info));
        //intent.setAction(Intent.ACTION_DIAL);
        //直接拨打电话
        //intent.setData(Uri.parse("tel://" + info));
        //intent.setAction(Intent.ACTION_CALL);
        //发送短信
        //intent.setData(Uri.parse("smsto:" + info));
        //intent.setAction(Intent.ACTION_SENDTO);
        //跳转到网页
        intent.setData(Uri.parse("http://" + info));
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }
}
