package br.com.fiap.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] imagens = new int[]{
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    };

    int contador = 0;

    ImageView imgPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = findViewById(R.id.imgPessoa);
    }

    public void imagemAnterior(View view) {
        if ( contador > 0 ) {
            contador--;
            imgPessoa.setImageResource( imagens[ contador ] );
        }
    }

    public void proximaImagem(View view) {
        if ( contador < imagens.length - 1 ) {
            contador++;
            imgPessoa.setImageResource( imagens[ contador ] );
        }
    }
}
