package me.zaelani.akb_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Button btnNext = findViewById(R.id.buttonNext);
        final EditText tvName = findViewById(R.id.editTextName);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = tvName.getText().toString();
                if (!name.equals("")) {
                    Intent intent = new Intent(InputActivity.this, FinishActivity.class);
                    intent.putExtra(NAME, name);
                    startActivity(intent);
                } else {
                    Toast.makeText(InputActivity.this, "Oops! Nama kamu tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
