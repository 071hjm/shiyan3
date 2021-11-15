package com.example.myapplication30;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class _customMenu extends AppCompatActivity {
    private TextView t = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custommenu);

        t = (TextView) findViewById(R.id.textView1);
    }
    //创建选择菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.custommenu, menu); //加载menu下的custommenu
        return super.onCreateOptionsMenu(menu);
    }
    //菜单的响应事件，根据ItemId辨别响应事件
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.font_10:
                t.setTextSize(10);
                return true;
            case R.id.font_20:
                t.setTextSize(20);
                return true;
            case R.id.font_30:
                t.setTextSize(30);
                return true;
            case R.id.font_40:
                t.setTextSize(40);
                return true;
            case R.id.font_50:
                t.setTextSize(50);
                return true;
            case R.id.font_60:
                t.setTextSize(60);
                return true;
            case R.id.commonMenu:
                Toast.makeText(_customMenu.this, "普通菜单项", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.red:
                t.setTextColor(Color.parseColor("#ff0000"));
                return true;
            case R.id.green:
                t.setTextColor(Color.parseColor("#00ff00"));
                return true;
            case R.id.blue:
                t.setTextColor(Color.parseColor("#0000ff"));
                return true;
            case R.id.black:
                t.setTextColor(Color.parseColor("#000000"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


