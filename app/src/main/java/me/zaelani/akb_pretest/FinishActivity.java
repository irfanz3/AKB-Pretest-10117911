package me.zaelani.akb_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        TextView textMessage = findViewById(R.id.textMessage);

        Intent intent = getIntent();
        String name = intent.getStringExtra(InputActivity.NAME);
        String sentence = String.format("Beres! Sekarang %s udah bisa ngecek penggunaan HP %s tiap hari buat bantu %s ngatur waktu :)", name, name, name);
        textMessage.setText(sentence);
    }
}
