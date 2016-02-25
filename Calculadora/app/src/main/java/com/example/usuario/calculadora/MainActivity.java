package com.example.usuario.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    Double numero1,numero2,resultado;
    String operador;
    Boolean puntodecimal = false;


    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;

        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }
    public void onClickSuma(View miView)
    {
        operador="+";
        miView.setClickable(false);
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;

            numero1 = Double.parseDouble(tv.getText().toString());
            tv.setText("");
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText("");
    }
    public void onClickBorra(View miView)
    {

        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText("");
    }

    public void onClickBtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "1");
        puntodecimal=false;
    }
    public void onClickBtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "2");
        puntodecimal=false;
    }
    public void onClickBtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "3");
        puntodecimal=false;
    }
    public void onClickBtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "4");
        puntodecimal=false;
    }
    public void onClickBtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "5");
        puntodecimal=false;
    }
    public void onClickBtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "6");
        puntodecimal=false;

    }
    public void onClickBtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;

        tv.setText(tv.getText() + "7");
        puntodecimal=false;
    }
    public void onClickBtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "8");
        puntodecimal=false;
    }
    public void onClickBtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "9");
        puntodecimal=false;
    }
    public void onClickBtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado) ;
        tv.setText(tv.getText() + "0");
        puntodecimal=false;
    }
    public void onClickBtnpunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.id_CampoResultado);
        if (puntodecimal == false){
                tv.setText(tv.getText() + ".");
            } else {
                return;
        }


        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
