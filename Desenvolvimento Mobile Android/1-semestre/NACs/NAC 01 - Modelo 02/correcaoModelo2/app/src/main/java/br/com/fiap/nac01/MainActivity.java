package br.com.fiap.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgOpcoes;
    EditText edtM2;
    CheckBox chkUltraFrete;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgOpcoes     = findViewById(R.id.rdgOpcoes);
        edtM2         = findViewById(R.id.edtM2);
        chkUltraFrete = findViewById(R.id.chkUltraFrete);
        txtResultado  = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        double valor = 0;

        switch ( rdgOpcoes.getCheckedRadioButtonId() ) {
            case R.id.rdbPisoBranco:
                valor = 24.9;
                break;
            case R.id.rdbPisoAlbania:
                valor = 11.9;
                break;
            case R.id.rdbPorcelanato:
                valor = 39.9;
                break;
            case R.id.rdbRevestimento:
                valor = 16.9;
                break;
        }

        String txtM2 = edtM2.getText().toString();
        double m2 = 0;

        try {
            m2 = Double.parseDouble(txtM2);
        } catch (Exception e) {
            Toast.makeText(this, "Por favor, verifique os dados informados!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            return;
        }


        double total = valor * m2;

        if ( chkUltraFrete.isChecked() ) {
            total = total * 1.3;
            // total *= 1.3;
        }

        String resultado = String.format(
                "R$ %.2f",
                total
        );

        txtResultado.setText( resultado );
    }
}
