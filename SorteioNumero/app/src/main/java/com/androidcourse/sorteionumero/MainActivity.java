package com.androidcourse.sorteionumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testeAlterar (View view) {

        TextView alterarTexto = findViewById(R.id.textView2_Resultado);
        alterarTexto.setText ("Texto Alterado");
    }
}
