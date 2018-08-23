package com.example.juan.epilepsia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Perfil_medico extends AppCompatActivity {
    CheckBox alergia,enfer;
    Button con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_medico);
        alergia=(CheckBox) findViewById(R.id.checkBox3);
        enfer=(CheckBox) findViewById(R.id.checkBox5);
    }
public void Contin(View view){
        if (view.getId()==R.id.Continuar){
            consultar();
        }
}
private void consultar(){
    if (alergia.isChecked()==true && enfer.isChecked()==true){
        Intent intent = new Intent(this,Alergias.class);
        intent.putExtra("Parametro",1);
        startActivity(intent);

    }else if (alergia.isChecked()==true&& enfer.isChecked()==false){
        Intent intent = new Intent(this,Alergias.class);
        intent.putExtra("Parametro",2);
        startActivity(intent);
    }else if (alergia.isChecked()==false&& enfer.isChecked()==true){
        Intent intent = new Intent(this,Alergias.class);
        intent.putExtra("Parametro",3);
        startActivity(intent);
    }else {
        Toast.makeText(this, "Ah prro eres sano", Toast.LENGTH_SHORT).show();
    }
}
}
