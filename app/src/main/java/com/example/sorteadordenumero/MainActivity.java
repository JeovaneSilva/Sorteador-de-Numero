package com.example.sorteadordenumero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private Button buttonSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        buttonSortear = findViewById(R.id.buttonSortear);

        buttonSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortearNumero();
            }
        });
    }

    private void sortearNumero() {
        int numeroSorteado = new Random().nextInt(100) + 1;

        textResultado.setText("Número sorteado: " + numeroSorteado);
    }
}