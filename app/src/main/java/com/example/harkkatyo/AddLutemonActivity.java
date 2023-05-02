package com.example.harkkatyo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddLutemonActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lutemon_add);
    }
    public void addLutemon(View view) {
        EditText name = findViewById(R.id.editName);
        RadioGroup colors = findViewById(R.id.colors);
        RadioButton color = findViewById(colors.getCheckedRadioButtonId());
        switch (colors.getCheckedRadioButtonId()) {
            case R.id.rbBlack:
                LutemonStorage.getInstance().addLutemon(new Black(name.getText().toString(), color.getText().toString()));
                HomeStorage.getInstance().addLutemon(new Black(name.getText().toString(), color.getText().toString()));
                break;
            case R.id.rbGreen:
                LutemonStorage.getInstance().addLutemon(new Green(name.getText().toString(), color.getText().toString()));
                HomeStorage.getInstance().addLutemon(new Green(name.getText().toString(), color.getText().toString()));
                break;
            case R.id.rbOrange:
                LutemonStorage.getInstance().addLutemon(new Orange(name.getText().toString(), color.getText().toString()));
                HomeStorage.getInstance().addLutemon(new Orange(name.getText().toString(), color.getText().toString()));
                break;
            case R.id.rbPink:
                LutemonStorage.getInstance().addLutemon(new Pink(name.getText().toString(), color.getText().toString()));
                HomeStorage.getInstance().addLutemon(new Pink(name.getText().toString(), color.getText().toString()));
                break;
            case R.id.rbWhite:
                LutemonStorage.getInstance().addLutemon(new White(name.getText().toString(), color.getText().toString()));
                HomeStorage.getInstance().addLutemon(new White(name.getText().toString(), color.getText().toString()));
                break;


        }
    }
}
