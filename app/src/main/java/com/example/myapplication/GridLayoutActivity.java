package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GridLayoutActivity extends AppCompatActivity {
    private EditText editText;

    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    private Button btn_add,btn_reduce,btn_ride,btn_except;
    private Button btn_back,btn_clear,btn_result,btn_point;
    private Boolean clear_flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);


        initView();
    }

    private void initView() {

        editText = findViewById(R.id.et);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_add = findViewById(R.id.btn_add);
        btn_reduce = findViewById(R.id.btn_reduce);
        btn_ride = findViewById(R.id.btn_ride);
        btn_except = findViewById(R.id.btn_except);

        btn_clear = findViewById(R.id.btn_clear);
        btn_back = findViewById(R.id.btn_back);
        btn_result = findViewById(R.id.btn_result);
        btn_point = findViewById(R.id.btn_point);

    }

    public void onClick(View view) {
        String input = editText.getText().toString();
        switch (view.getId()){
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
                if (clear_flag =false){
                    editText.setText("");//空赋值
                }
                editText.setText(input+ ((Button)view).getText().toString());
                break;

            case R.id.btn_add:
            case R.id.btn_reduce:
            case R.id.btn_ride:
            case R.id.btn_except:

                if (clear_flag){
                    clear_flag = false;
                    input = "";
                    editText.setText("");
                }
                editText.setText(input+((Button)view).getText().toString());
                break;

            case R.id.btn_back:


        }


    }
}
