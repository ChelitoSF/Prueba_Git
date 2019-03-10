package IPN.MX.Reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu extends AppCompatActivity
{

    private TextView Usuario;
    private EditText Nombre;
    private EditText Email;
    private EditText Fecha;
    private EditText Telef;
    private TextView Alert;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent VentPas = getIntent();
        Bundle DatosPas = VentPas.getExtras();

        Usuario= (TextView) findViewById(R.id.Usu);
        Usuario.setText(DatosPas.getString("Usuario"));

        Nombre= (EditText) findViewById(R.id.Nom_Re);
        Email= (EditText) findViewById(R.id.Ema_Re);
        Fecha= (EditText) findViewById(R.id.Fech_Re);
        Telef= (EditText) findViewById(R.id.Tel_Re);
        Alert= (TextView) findViewById(R.id.Alerta);
    }

    public void Valida_Reser(View V)
    {
        String Nom = (Nombre.getText()).toString();
        String Ema = (Email.getText()).toString();
        String Fec = (Fecha.getText()).toString();
        String Tel = (Telef.getText()).toString();

        if(Nom.equals("") && Ema.equals("") && Fec.equals("") && Tel.equals(""))
        {
            Alert.setText("Faltan campos por llenar");
        }
        else
        {
            Realiza_Reser();
        }
    }

    private void Realiza_Reser()
    {
        String Nom = (Nombre.getText()).toString();
        String Ema = (Email.getText()).toString();
        String Fec = (Fecha.getText()).toString();
        String Tel = (Telef.getText()).toString();

        Intent Reserva = new Intent(this , Reservacion.class);
        Bundle DatosR = new Bundle();
            DatosR.putString("Nombre" , Nom);
            DatosR.putString("Email" , Ema);
            DatosR.putString("Fecha" , Fec);
            DatosR.putString("Telef" , Tel);
        Reserva.putExtras(DatosR);
        startActivity(Reserva);
    }

    public void Cerrar_Se(View V)
    {
        Intent Cerrar = new Intent(this, MainActivity.class);
        startActivity(Cerrar);
    }

}
