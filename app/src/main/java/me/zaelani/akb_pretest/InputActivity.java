package me.zaelani.akb_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InputActivity extends AppCompatActivity {
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }
}
