package com.example.quizes;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txvPergunta;
    RadioGroup rdgroup;
    Button btnPergunta;

    int pontuacao = 0 ;
    int indicePergunta = 0 ;

    String [] perguntas = {
            "minha pergunta 1",
            "minha pergunta 2",
            "minha pergunta 3",
            "minha pergunta 4",
            "minha pergunta 5"

    };

    int [] respostaCorretas = {
        R.id.rdb1,
            R.id.rdb1,
            R.id.rdb2,
            R.id.rdb4,
            R.id.rdb3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}