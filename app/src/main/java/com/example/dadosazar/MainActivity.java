package com.example.dadosazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView iv1;
    private ImageView iv2;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1= findViewById(R.id.iv1);
        iv2= findViewById(R.id.iv2);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
    }



    public void tirar(View v){

        int valorUno=1+(int)(Math.random()*6);
        int valorDos=1+(int)(Math.random()*6);

        if(rb1.isChecked()){
            iv2.setImageResource(R.drawable.dices);
            switch (valorUno) {
                case 1:
                    iv1.setImageResource(R.drawable.dado1);
                    break;
                case 2:
                    iv1.setImageResource(R.drawable.dado2);
                    break;
                case 3:
                    iv1.setImageResource(R.drawable.dado3);
                    break;
                case 4:
                    iv1.setImageResource(R.drawable.dado4);
                    break;
                case 5:
                    iv1.setImageResource(R.drawable.dado5);
                    break;
                case 6:
                    iv1.setImageResource(R.drawable.dado6);
                    break;
            }
        }

        if(rb2.isChecked()){
            switch (valorUno) {
                case 1:
                    iv1.setImageResource(R.drawable.dado1);
                    break;
                case 2:
                    iv1.setImageResource(R.drawable.dado2);
                    break;
                case 3:
                    iv1.setImageResource(R.drawable.dado3);
                    break;
                case 4:
                    iv1.setImageResource(R.drawable.dado4);
                    break;
                case 5:
                    iv1.setImageResource(R.drawable.dado5);
                    break;
                case 6:
                    iv1.setImageResource(R.drawable.dado6);
                    break;
            }
            switch (valorDos) {
                case 1:
                    iv2.setImageResource(R.drawable.dado1);
                    break;
                case 2:
                    iv2.setImageResource(R.drawable.dado2);
                    break;
                case 3:
                    iv2.setImageResource(R.drawable.dado3);
                    break;
                case 4:
                    iv2.setImageResource(R.drawable.dado4);
                    break;
                case 5:
                    iv2.setImageResource(R.drawable.dado5);
                    break;
                case 6:
                    iv2.setImageResource(R.drawable.dado6);
                    break;
            }
        }
        //else{
          //  Toast.makeText(this, "Seleccione una opción", Toast.LENGTH_SHORT).show();
        //}

    }
}