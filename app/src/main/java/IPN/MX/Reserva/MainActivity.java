package IPN.MX.Reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText Usu;
    private EditText Con;
    private TextView Alert;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Usu = (EditText) findViewById(R.id.Text_Usu);
        this.Con = (EditText) findViewById(R.id.Text_Con);
        this.Alert=  (TextView) findViewById(R.id.alert);
    }

    public void Iniciar_S (View V)
    {
        String Usu_T = this.Usu.getText().toString();
        String Con_T = this.Con.getText().toString();

        if(Usu_T.equals("ConsueloSF"))
        {
            if(Con_T.equals("6IM7Batiz"))
            {
                Intent Sig_A=  new Intent(this , Menu.class);
                Bundle Datos = new Bundle();
                Datos.putString("Usuario" , Usu_T);
                Sig_A.putExtras(Datos);
                startActivity(Sig_A);
            }
            else
            {
                Alert.setText("Contraseña Erronea");
            }
        }
        else
        {
            Alert.setText("Usuario Erroneo");
        }
    }

}
