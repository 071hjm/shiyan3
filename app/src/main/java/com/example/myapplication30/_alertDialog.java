package com.example.myapplication30;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _alertDialog extends Activity {
    private Button b = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);

        b = (Button)findViewById(R.id.button7);
        //为按钮添加一个监听事件
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(_alertDialog.this);
                AlertDialog dialog = builder.create();
                View dialogView = View.inflate(_alertDialog.this, R.layout.alertdialog, null);
                dialog.setView(dialogView);
                dialog.show();

            }
        });
    }
}
