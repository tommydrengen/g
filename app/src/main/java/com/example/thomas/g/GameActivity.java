package com.example.thomas.g;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    TextView synligtOrd;
    TextInputLayout gtil; // gæt
    Button ok, nulstil;
    g.Galgelogik g;
    ImageView iv;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);




        gtil = findViewById(R.id.input);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);
        ok.setText("Ok");
        nulstil = findViewById(R.id.nulstil);
        nulstil.setOnClickListener(this);
        nulstil.setText("Nulstil");
       // iv = findViewById(R.drawable.galge);
        iv = findViewById(R.id.iv);


        g = new g.Galgelogik();

        synligtOrd = findViewById(R.id.synord);
        synligtOrd.setText(g.getSynligtOrd());
    }


    @Override
    public void onClick(View view) {
        if (view == ok) {

            str = gtil.toString();
            Log.d("msg",str);
            g.gætBogstav(str);
            synligtOrd.setText(g.getSynligtOrd());

            switch (g.getAntalForkerteBogstaver()){
                case 0:
                    iv.setImageResource(R.drawable.galge);
                    break;
                case 1:
                    iv.setImageResource(R.drawable.forkert1);
                    break;
                case 2:
                    iv.setImageResource(R.drawable.forkert2);
                    break;
                case 3:
                    iv.setImageResource(R.drawable.forkert3);
                    break;
                case 4:
                    iv.setImageResource(R.drawable.forkert4);
                    break;
                case 5:
                    iv.setImageResource(R.drawable.forkert5);
                    break;
                case 6:
                    iv.setImageResource(R.drawable.forkert6);
                    break;

            }

            if(view == nulstil){         // nulstil button klik
                g.nulstil(); //logisk
                synligtOrd.setText(g.getOrdet()); //grafisk

            }

            g.logStatus();



            g.erSpilletSlut();
            if(g.erSpilletVundet()){     // Skift til vind aktivitet
                Intent i = new Intent(this,WinActivity.class);
            }

            else if(g.erSpilletTabt()){  // Skift til tab aktivitet
                Intent i = new Intent(this, LoseActivity.class);
            }
        }



        }


    }

