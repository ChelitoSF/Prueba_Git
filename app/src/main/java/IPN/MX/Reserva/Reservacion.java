package IPN.MX.Reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Reservacion extends AppCompatActivity
{

    private TextView NomR;
    private TextView EmaR;
    private TextView TelR;
    private TextView FecR;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservacion);
        NomR = (TextView) findViewById(R.id.Text_NomR);
        EmaR = (TextView) findViewById(R.id.Text_EmailR);
        TelR = (TextView) findViewById(R.id.Text_TeleR);
        FecR = (TextView) findViewById(R.id.Text_DiaR);

        Intent VentPas = getIntent();
        Bundle DatosPas = VentPas.getExtras();
        NomR.setText("Nombre: " + DatosPas.getString("Nombre"));
        EmaR.setText("Email: " + DatosPas.getString("Email"));
        FecR.setText("Fecha: " + DatosPas.getString("Fecha"));
        TelR.setText("Telefono: " + DatosPas.getString("Telef"));
    }

    public void CerrarSe(View V)
    {
        Intent Cerrar = new Intent(this, MainActivity.class);
        startActivity(Cerrar);
    }

    public void Menu(View V)
    {
        Intent VMenu = new Intent(this, Menu.class);
        startActivity(VMenu);
    }


}
