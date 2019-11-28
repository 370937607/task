package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn_gride,btn_relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_gride = findViewById(R.id.btn_gridlayout);
        btn_relative = findViewById(R.id.btn_Relativelayout);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.btn_gridlayout:
                intent = new Intent(MainActivity.this,GridLayoutActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_Relativelayout:
//                intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
