package com.androidCourse.project001;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view){

        TextView nomeQualquer = findViewById(R.id.alteracaoTexto);
        nomeQualquer.setText("Texto Modificado");

    }
}
