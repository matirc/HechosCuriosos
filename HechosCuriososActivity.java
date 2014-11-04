package com.example.mati.hechoscuriosos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class HechosCuriososActivity extends Activity {


//Declare the new View Variables

    int x;
    TextView factLabel;
    Button hechobutton ;
    String a[] = { "Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro de los juegos olímpicos están hechas de plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.",
            "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambu pueden crecer hasta un metro al día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        factLabel=(TextView) findViewById(R.id.verhechoTextView);
        VerHechobutton=(Button) findViewById(R.id.hechobutton);


        VerHechobutton.setOnClickListener(new View.OnClickListener() {
            @Override
     public void onClick(View view) {
             String fact= "";
             factLabel.setText(a[x]);
             Random rnd = new Random();
             x = rnd.nextInt(a.length);


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
