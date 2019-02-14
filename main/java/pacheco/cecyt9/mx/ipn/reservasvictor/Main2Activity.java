package pacheco.cecyt9.mx.ipn.reservasvictor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView name, correo, numTel, numTar, cvc, personitas;


    Button btnEnviar;

    SeekBar barrita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.Name);
        correo = findViewById(R.id.Email);
        numTel = findViewById(R.id.NumTel);
        numTar = findViewById(R.id.NumTar);
        cvc = findViewById(R.id.Cvc);
        personitas = findViewById(R.id.Persons);

        btnEnviar = findViewById(R.id.Registra2);

        Bundle bundle = new Bundle();
        bundle = this.getIntent().getExtras();


        String uno = "Nombre: " + bundle.getString("Nombre");
        String dos = "Correo: " + bundle.getString("Correo");
        String tres = "Numero telefonico: " + bundle.getString("numTel");
        String cuatro = "Numero de Tarjeta: " + bundle.getString("numTar");
        String cinco = "Cvc: " + bundle.getString("cvc");
        String seis = "NUmero de personas: " + bundle.getString("seekBar");

        name.setText(uno);
        correo.setText(dos);
        numTel.setText(tres);
        numTar.setText(cuatro);
        cvc.setText(cinco);
        personitas.setText(seis);

    }

    @Override
    public void onClick(View v) {

        Intent Actividad3 = new Intent(this, Main3Activity.class);
        finish();
        startActivity(Actividad3);

    }
}
