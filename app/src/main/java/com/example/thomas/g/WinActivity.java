package com.example.thomas.g;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    TextView vindertekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        vindertekst = (TextView) findViewById(R.id.vindertekst);
        vindertekst.setText("Tillykke, du har vundet");
    }
}
