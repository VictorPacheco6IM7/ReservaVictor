package pacheco.cecyt9.mx.ipn.reservasvictor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, correo, numTel, numTar, cvc;

    TextView num;

    Button btnEnviar;

    SeekBar barrita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nomCompleto);
        correo = findViewById(R.id.correoElectronico);
        numTel = findViewById(R.id.numTel);
        numTar = findViewById(R.id.numTar);
        cvc = findViewById(R.id.cvc);

        num  = findViewById(R.id.num);

        barrita = findViewById(R.id.seekBar);

        btnEnviar = findViewById(R.id.Registra);

        num.setText(barrita.getProgress() + " personas");

        barrita.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                num.setText(progress + " personas");
            }
        });
    }

    @Override
    public void onClick(View v) {

            Guardar(v);

    }

    public void Guardar(View v){
        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datitos = new Bundle();

        datitos.putString("Nombre", name.getText().toString());
        datitos.putString("Correo", correo.getText().toString());
        datitos.putString("numTel", numTel.getText().toString());
        datitos.putString("numTar", numTar.getText().toString());
        datitos.putString("cvc", cvc.getText().toString());
        datitos.putString("seekBar", String.valueOf(barrita.getProgress()));
        envia.putExtras(datitos);
        finish();
        startActivity(envia);
    }
}
