package com.montoyaramirezluis.pmdm02_android_ejemplo_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * En este ejemplo vamos a capturar el click de un botón de distintas formas:
 *
 * USAR LA 1 O LA 3 (POR AHORA ME GUSTA MAS LA 3)
 *
 * 1.- Implementando la interfaz OnClickListener en la clase
 * 2.- Utilizando la implementación anónima privada al control
 * 3.- Utilizando la implementación anónima (miEvento)
 * 4.- Directamente asociando el método en XML
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.- Registrando el evento al método OnclickListener de la clase
        // ----------------------------------------------------------------
        Button btn1 = findViewById(R.id.boton1);
        btn1.setOnClickListener(this);
        // ----------------------------------------------------------------

        // 2.- Utilizando implementación anónima privada al control
        // ----------------------------------------------------------------
        Button btn2 = findViewById(R.id.boton2);
        btn2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Click desde anónima 1", Toast.LENGTH_SHORT).show());
        // ----------------------------------------------------------------

        // 3.- Utilizando implementación anónima (miEvento)
        // ----------------------------------------------------------------
        Button btn3 = findViewById(R.id.boton3);
        btn3.setOnClickListener(miEvento);
    }

    private final View.OnClickListener miEvento = v -> Toast.makeText(MainActivity.this, "Click desde anónima 2", Toast.LENGTH_SHORT).show();

    // Para usarlo así tenemos que implementar View.OnClickListener en la clase.

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.boton1:
                Toast.makeText(this, "Click desde implements", Toast.LENGTH_SHORT).show();
                break;
            case R.id.boton4:
                Toast.makeText(this, "Click desde XML", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}