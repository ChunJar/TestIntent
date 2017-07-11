package com.example.cj.testintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Intent:表示意图，一般用来表示跳转内容，实现组件之间的跳转。
 * 六大属性：
 * ComponentName：组件名
 * Action：定义动作。为了区别当前的Intent对象。类型是字符串类型
 * Category：分类。进一步筛选要处理的内容
 * Extra：表示额外的内容。用于Intent传递数据。
 *      putExtra(键值对);键是字符串类型
 *      putExtras(Bundle类型的对象);
 * Data：数据。包含了Uri类型的唯一字段。类似于tel:// 定义了唯一性的标识前缀。
 *      使用action和data结合可以实现跳转到系统的应用对应的界面。
 *
 * 启动一个Activity一般有两种形式，分别是显式启动和隐式启动
 * 显式启动： Intent i = new Intent(当前Activity.this,目标Activity.class);
 * 隐式启动（不指明从哪里跳转，跳转到哪里去）：Intent i = new Intent();
 *      如果要实现隐式启动，一般要使用action和data或者action和category结合
 */
public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.main_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(i);

//                ComponentName cn = new ComponentName(MainActivity.this, SecondActivity.class);
//                Intent i = new Intent();
//                i.setComponent(cn);
//                startActivity(i);

                Intent intent = new Intent();
                //设定action动作
                intent.setAction("com.example.cj.testintent.MainActivity.action");
                startActivity(intent);
            }
        });

    }
}
