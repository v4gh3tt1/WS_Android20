package com.androidcourse.sorteionumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view) {

        TextView alterarTexto = findViewById(R.id.textView2_Resultado);

        int numSorteio = new Random().nextInt(11);

        alterarTexto.setText ("" + numSorteio + "");
    }
}
