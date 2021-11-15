package com.example.myapplication30;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import android.view.View;

public class MainActivity extends Activity {

    private Button b = null; //创建一个button类

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button1);//寻找button1
        b.setOnClickListener(new View.OnClickListener() { //设置按钮监听
            public void onClick(View v) {
                Intent intent_simpleAdapter = new Intent(); //新建一个类事件
                intent_simpleAdapter.setClass(MainActivity.this, _simpleAdapter.class); //放置_simpleAdapter类
                MainActivity.this.startActivity(intent_simpleAdapter);//跳转_simpleAdapter
            }
        });

        b = (Button)findViewById(R.id.button2);//寻找button2
        b.setOnClickListener(new View.OnClickListener() { //设置按钮监听
            public void onClick(View v) {
                Intent intent_alertDialog = new Intent(); //新建一个类事件
                intent_alertDialog.setClass(MainActivity.this, _alertDialog.class); //放置_alertDialog类
                MainActivity.this.startActivity(intent_alertDialog);//跳转_alertDialog
            }
        });

        b = (Button)findViewById(R.id.button3); //寻找button3
        b.setOnClickListener(new View.OnClickListener() { //设置按钮监听
            public void onClick(View v) {
                Intent intent_customMenu = new Intent(); //新建一个类事件
                intent_customMenu.setClass(MainActivity.this, _customMenu.class); //放置_customMenu类
                MainActivity.this.startActivity(intent_customMenu); //跳转_customMenu
            }
        });

        b = (Button)findViewById(R.id.button4); //寻找button4
        b.setOnClickListener(new View.OnClickListener() { //设置按钮监听
            public void onClick(View v) {
                Intent intent_actionMode = new Intent(); //新建一个类事件
                intent_actionMode.setClass(MainActivity.this,_actionMode.class); //放置_actionMode类
                MainActivity.this.startActivity(intent_actionMode); //跳转_actionMode
            }
        });
    }
}