package com.example.juan.epilepsia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText NombreUsu;
    private EditText Contraseña;
    private Switch Recordar;
    private Button btnLogin;
    private Button Registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicio();
    }
    public void ini_se(View view){
        String Contra=Contraseña.getText().toString();
        login(Contra);
    }

    public void Regis(View view){
        reg();
    }

    private void inicio (){
        NombreUsu= (EditText)  findViewById(R.id.NombreUsu);
        Contraseña= (EditText) findViewById(R.id.Contraseña);
        btnLogin= (Button) findViewById(R.id.btnLogin);
        Registro=(Button) findViewById(R.id.button3);
        Recordar= (Switch) findViewById(R.id.switch2);
    }

    private boolean contra(String Contraseña){
        return !TextUtils.isEmpty(Contraseña);
    }

    private void reg (){
        Intent r = new Intent(this,tipo_regis.class);
        startActivity(r);
    }

    private boolean login(String Contraseña){
        if (!contra(Contraseña)){
            Toast.makeText(this,"Contraseña vacia",Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }

}

