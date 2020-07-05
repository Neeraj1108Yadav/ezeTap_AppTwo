package com.example.ezetap_apptwo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if(intent != null){
            String operation = intent.getStringExtra("operation");
            int num1 = intent.getIntExtra("num1",0);
            int num2 = intent.getIntExtra("num2",0);
            if(operation != null){
                switch (operation)
                {
                    case "addition":
                        handleAddition(num1,num2);
                        break;
                    case "subtraction":
                        handleSubtraction(num1,num2);
                        break;
                }
            }
        }
    }

    private void handleAddition(int num1,int num2) {
       int result = num1+num2;
       Intent intent = new Intent();
       intent.putExtra("result",result);
       setResult(102,intent);
       finish();
    }

    private void handleSubtraction(int num1,int num2) {
        int result = num2-num1;
        Intent intent = new Intent();
        intent.putExtra("result",result);
        setResult(103,intent);
        finish();
    }
}