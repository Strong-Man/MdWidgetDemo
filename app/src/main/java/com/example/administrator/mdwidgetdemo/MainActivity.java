package com.example.administrator.mdwidgetdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mGoToolbarBtn, mGoDrawerBtn, mGoBehaviorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mGoToolbarBtn = findViewById(R.id.go_toolbar);
        mGoDrawerBtn = findViewById(R.id.go_drawer);
        mGoBehaviorBtn = findViewById(R.id.go_behavior);

        mGoToolbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToolbarAct.class);
                startActivity(intent);
            }
        });

        mGoDrawerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrawerAct.class);
                startActivity(intent);
            }
        });

        mGoBehaviorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BehaviorAct.class);
                startActivity(intent);
            }
        });
    }
}
