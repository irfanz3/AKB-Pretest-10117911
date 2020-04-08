package me.zaelani.akb_pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CodeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        Button btnBuyCode = findViewById(R.id.buyCode);
        Button btnLogin = findViewById(R.id.login);

        btnBuyCode.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buyCode:
                onClickBuyCode();
                break;
            case R.id.login:
                onClickLogin();
                break;
        }
    }

    private void onClickBuyCode() {
        Toast.makeText(CodeActivity.this, "YAY! Kamu berhasil membeli code", Toast.LENGTH_LONG).show();
    }

    private void onClickLogin() {
        Intent intent = new Intent(CodeActivity.this, InputActivity.class);
        startActivity(intent);
    }
}
