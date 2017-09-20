package com.example.fanenqian.custompopwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomPopupWindow customPopupWindow = new CustomPopupWindow.Builder()
                        .with(MainActivity.this)
                        .setContentView(R.layout.pop_view)
//                        .setwidth(100)
//                        .setheight(100)
                        .setBackGroudAlpha(MainActivity.this, 0.7f)
                        .setAnimationStyle(CustomPopupWindow.Builder.STYLE2)
                        .setFouse(true)
                        .setOutSideCancel(true)
                        .builder().showAsLaction(view, Gravity.CENTER, 0, 0);
            }
        });
    }
}
