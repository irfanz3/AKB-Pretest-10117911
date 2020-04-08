package me.zaelani.akb_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        TextView textMessage = findViewById(R.id.textMessage);
        Button btnFinish = findViewById(R.id.buttonFinish);

        Intent intent = getIntent();
        String name = intent.getStringExtra(InputActivity.NAME);
        String sentence = String.format("Beres! Sekarang %s udah bisa ngecek penggunaan HP %s tiap hari buat bantu %s ngatur waktu :)", name, name, name);
        textMessage.setText(sentence);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
