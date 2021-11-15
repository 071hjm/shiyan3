package com.example.myapplication30;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class _actionMode extends AppCompatActivity {
    private ListView textView = null;
    private String data[] = {"one","two","three","four","five","six","seven"};
    private int Data[] = {0,0,0,0,0,0,0};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmode); //寻找actionmode布局

        textView = (ListView) findViewById(R.id.listview2); //寻找listview2
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);//根据data添加simple_list_item_1，只有一行
        textView.setAdapter(adapter);
        this.registerForContextMenu(textView);

        //为textView添加一个点击监听
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView context = (TextView) view.findViewById(android.R.id.text1);
                Toast.makeText(_actionMode.this, context.getText().toString(), Toast.LENGTH_SHORT).show();

                Data[i] = 1 - Data[i];
                if (Data[i] == 1) context.setBackgroundColor(Color.parseColor("#ff0000"));
                else context.setBackgroundColor(Color.parseColor("#ffffff"));

                int num = 0;
                for( int j = 0; j < Data.length; j++) {
                    if (Data[j] == 1) num++;
                }
                if (num == 0) setTitle("unSelected");
                else setTitle("Selected" + num);
            }
        });
    }
    //设置上下文菜单
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("文件操作");
        menu.add(1,1,1,"复制");//第一个数据是组，第二个数据是id，第三个是显示顺序，第三个数据是显示文字
        menu.add(1,2,1,"粘贴");
        menu.add(1,3,1,"剪切");
        menu.add(1,4,1,"重命名");
    }
    //为上下文菜单项添加事件
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
                Toast.makeText(_actionMode.this,"复制",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(_actionMode.this,"粘贴",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(_actionMode.this,"剪切",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(_actionMode.this,"重命名",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
