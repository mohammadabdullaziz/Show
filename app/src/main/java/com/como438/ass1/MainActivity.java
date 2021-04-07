package com.como438.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName= findViewById(R.id.edtName);
    }

    public void btnShow_Onclic(View view) {
        String Name = edtName.getText().toString().trim();
        if(!Name.isEmpty())
            Toast.makeText(this,Name, Toast.LENGTH_SHORT).show();
    }

}