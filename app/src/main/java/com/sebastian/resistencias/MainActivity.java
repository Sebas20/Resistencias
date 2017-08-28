package com.sebastian.resistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button bSalir, bCalcular;
    private TextView tFranja_1, tFranja_2, tFranja_3, tTolerancia;
    private EditText eResultado;
    private Spinner sFranja_1, sFranja_2, sFranja_3, sTolerancia;
    private String color_franja_1 = "", color_franja_2 = "", color_franja_3 = "", tolerancia = "",ohm="";
    private int a = 0, b = 0, c = 0, d = 0, valor_1 = 0, valor_2 = 0, valor_3 = 0, resul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ItemData> list = new ArrayList<>();
        ArrayList<ItemData> list_1 = new ArrayList<>();
        ArrayList<ItemData> list_2 = new ArrayList<>();

        list.add(new ItemData("Negro", R.mipmap.negro));
        list.add(new ItemData("Cafe", R.mipmap.cafe));
        list.add(new ItemData("Rojo", R.mipmap.rojo));
        list.add(new ItemData("Naranja", R.mipmap.naranja));
        list.add(new ItemData("Amarillo", R.mipmap.amarillo));
        list.add(new ItemData("Verde", R.mipmap.verde));
        list.add(new ItemData("Azul", R.mipmap.azul));
        list.add(new ItemData("Violeta", R.mipmap.violeta));
        list.add(new ItemData("Gris", R.mipmap.gris));
        list.add(new ItemData("Blanco", R.mipmap.blanco));

        list_1.add(new ItemData("Cafe", R.mipmap.cafe));
        list_1.add(new ItemData("Rojo", R.mipmap.rojo));
        list_1.add(new ItemData("Dorado", R.mipmap.oro));
        list_1.add(new ItemData("Plata", R.mipmap.plata));

        list_2.add(new ItemData("Negro", R.mipmap.negro));
        list_2.add(new ItemData("Cafe", R.mipmap.cafe));
        list_2.add(new ItemData("Rojo", R.mipmap.rojo));
        list_2.add(new ItemData("Naranja", R.mipmap.naranja));
        list_2.add(new ItemData("Amarillo", R.mipmap.amarillo));
        list_2.add(new ItemData("Verde", R.mipmap.verde));
        list_2.add(new ItemData("Azul", R.mipmap.azul));
        list_2.add(new ItemData("Violeta", R.mipmap.violeta));


        bSalir = (Button) findViewById(R.id.bSalir);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        eResultado = (EditText) findViewById(R.id.eResultado);
        tFranja_1 = (TextView) findViewById(R.id.tFranja_1);
        tFranja_2 = (TextView) findViewById(R.id.tFranja_2);
        tFranja_3 = (TextView) findViewById(R.id.tFranja_3);
        tTolerancia = (TextView) findViewById(R.id.tTolerancia);
        sFranja_1 = (Spinner) findViewById(R.id.sFranja_1);
        sFranja_2 = (Spinner) findViewById(R.id.sFranja_2);
        sFranja_3 = (Spinner) findViewById(R.id.sFranja_3);
        sTolerancia = (Spinner) findViewById(R.id.sTolerancia);

        SpinnerAdapter adapter = new SpinnerAdapter(this, R.layout.spinner_layout, R.id.txt, list);
        SpinnerAdapter adapter1 = new SpinnerAdapter(this, R.layout.spinner_layout, R.id.txt, list_1);
        SpinnerAdapter adapter2 = new SpinnerAdapter(this, R.layout.spinner_layout, R.id.txt, list_2);
        sFranja_1.setAdapter(adapter);
        sFranja_2.setAdapter(adapter);
        sFranja_3.setAdapter(adapter2);
        sTolerancia.setAdapter(adapter1);

        sFranja_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                a = i;
                switch (a) {
                    case 0:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.black));
                        break;
                    case 1:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case 3:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 4:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.yellow));
                        valor_1 = 4;
                        break;
                    case 5:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 6:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.purple));
                        break;
                    case 8:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        tFranja_1.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sFranja_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                b = i;
                switch (b) {

                    case 0:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.black));
                        break;
                    case 1:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case 3:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 4:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 6:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.purple));
                        break;
                    case 8:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        tFranja_2.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sFranja_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                c = i;
                switch (c) {

                    case 0:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.black));
                        valor_3 = 1;
                        ohm = " Ohms";
                        break;
                    case 1:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.brown));
                        valor_3 = 10;
                        ohm = " Ohms";
                        break;
                    case 2:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.red));
                        valor_3 = 100;
                        ohm = " Ohms";
                        break;
                    case 3:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.orange));
                        valor_3 = 1;
                        ohm = " Kilo Ohms";
                        break;
                    case 4:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.yellow));
                        valor_3 = 10;
                        ohm = " Kilo Ohms";
                        break;
                    case 5:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.green));
                        valor_3 = 100;
                        ohm = " Kilo Ohms";
                        break;
                    case 6:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.blue));
                        valor_3 = 1;
                        ohm = " Mega Ohms";
                        break;
                    case 7:
                        tFranja_3.setBackgroundColor(getResources().getColor(R.color.purple));
                        valor_3 = 10;
                        ohm = " Mega Ohms";
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        sTolerancia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                d = i;
                switch (d) {

                    case 0:
                        tTolerancia.setBackgroundColor(getResources().getColor(R.color.brown));
                        tolerancia = " 1%";
                        break;
                    case 1:
                        tTolerancia.setBackgroundColor(getResources().getColor(R.color.red));
                        tolerancia = " 2%";
                        break;
                    case 2:
                        tTolerancia.setBackgroundColor(getResources().getColor(R.color.gold));
                        tolerancia = " 5%";
                        break;
                    case 3:
                        tTolerancia.setBackgroundColor(getResources().getColor(R.color.silver));
                        tolerancia = " 10%";
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor_1 = a * 10;
                valor_2 = b;
                resul = (valor_1 + valor_2) * valor_3;
                eResultado.setGravity(1);
                eResultado.setText(Integer.toString(resul) + ohm + tolerancia);
            }
        });

        bSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });


    }
}
