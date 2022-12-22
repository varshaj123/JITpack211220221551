package com.main.airbookpackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.main.mylibrary.LibraryMain;

public class TestActivty extends AppCompatActivity {
    private Button redirectBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activty);

        redirectBtn = findViewById(R.id.redirectBtn);
        redirectBtn.setOnClickListener(v -> {
            Intent myIntent = new Intent(TestActivty.this, LibraryMain.class);
            //myIntent.putExtra("key", value); //Optional parameters
            TestActivty.this.startActivity(myIntent);
        });
    }
}