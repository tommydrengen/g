package com.example.thomas.g;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoseActivity extends AppCompatActivity {

    TextView tvlose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        tvlose = findViewById(R.id.tvlose);
    }
}
