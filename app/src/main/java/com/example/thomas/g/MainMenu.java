package com.example.thomas.g;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok = (Button) findViewById(R.id.k);
        ok.setText("OK");
        ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == ok) {
            Log.d("mmklik","Hej fra mainmenu ok klik");
            Intent i = new Intent(this, GameActivity.class);
            //navn = til.toString();
            //i.putExtra("key",navn);//string name,int value
            startActivity(i);
        }
    }
}
