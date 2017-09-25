package com.diurnohlc.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

   @Override
    private double contador = 1;
    private TextView texto;


    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById (R.id.text);

        texto.setText (String.valueOf (contador));

 /* 2ª forma alternativa de recuperar el estado
 if (estado != null) {
 contador = estado.getInt ("posicion");
 texto.setText (String.valueOf(contador));
 }
 */

    }
    // duplica el valor del contador y lo guarda en la etiqueta texto
    public void duplica (View view) {
        contador = contador * 2;
        texto.setText(String.valueOf(contador));
  /**  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
