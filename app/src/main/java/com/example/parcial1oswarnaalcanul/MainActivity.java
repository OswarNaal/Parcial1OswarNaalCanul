package com.example.parcial1oswarnaalcanul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText n1;
private EditText n2;
private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n1 =findViewById(R.id.num1);
        this.n2 =findViewById(R.id.num2);
        this.resultado = findViewById(R.id.result);
    }

    public void onClick(View view) {
        if(view.getId() == R.id.suma){
            resultado.setText("RESULTADO: " + Sumar());
        } else if (view.getId() == R.id.resta){
            resultado.setText("RESULTADO: " + Restar());
        }else if (view.getId() == R.id.multi){
            resultado.setText("RESULTADO: " + Multiplicar());
        }else if (view.getId() == R.id.div){
            resultado.setText("RESULTADO: " + Dividir());
        }
    }

    // metodos
    public double Sumar(){
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) + Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    public double Restar(){
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) - Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    public double Multiplicar(){
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }

    public double Dividir(){
        double resultado = 0;
        double numero1 = 0 ;
        double numero2 = 0;

        numero1 = Double.parseDouble(this.n1.getText().toString().trim());
        numero2 = Double.parseDouble(this.n2.getText().toString().trim());

        if (numero2 == 0){
            Toast.makeText(this,"No es posible realizar esta operación",Toast.LENGTH_LONG).show();
        } else{
            resultado = numero1 / numero2;
        }
        return resultado;
    }
}