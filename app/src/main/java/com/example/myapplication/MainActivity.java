package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        buttonZero = findViewById(R.id.button_zero);
        buttonZero.setBackgroundColor(0xFF666666);

    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            buttonZero.setBackgroundColor(0xFFFF0000);
    }
    public void toZero(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        buttonZero.setBackgroundColor(0xFF666666);
    }
}