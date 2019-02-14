package pacheco.cecyt9.mx.ipn.reservasvictor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = findViewById(R.id.btn3);
    }

    @Override
    public void onClick(View v) {
        Intent Actividad3 = new Intent(this, MainActivity.class);
        finish();
        startActivity(Actividad3);
    }
}
