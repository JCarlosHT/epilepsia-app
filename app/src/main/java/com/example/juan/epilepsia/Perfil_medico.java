package com.example.juan.epilepsia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Perfil_medico extends AppCompatActivity {
    CheckBox alergia,enfer;
    EditText edad,sangre,hospital;
    RadioButton m,h;
    Button con;
    public datos_prim datosPrim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_medico);
        Bundle datos_prim_envi=getIntent().getExtras();
        if(datos_prim_envi!=null)
        {
            datosPrim=(datos_prim) datos_prim_envi.getSerializable("datos_pri");


        }
        ini();
    }



    public void Contin(View view){
            if (view.getId()==R.id.Continuar){
                String s=sangre.getText().toString();
                String a=alergia.getText().toString();
                String e=enfer.getText().toString();
                String ed=edad.getText().toString();
                String h=hospital.getText().toString();
                vacio(s,ed,h);
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
        }
    }

    private void ini(){
        alergia=(CheckBox) findViewById(R.id.checkBox3);
        enfer=(CheckBox) findViewById(R.id.checkBox5);
        m=(RadioButton) findViewById(R.id.radioButton3);
        h=(RadioButton) findViewById(R.id.radioButton2);
        edad=(EditText) findViewById(R.id.editText7);
        sangre=(EditText) findViewById(R.id.editText6);
        hospital=(EditText)findViewById(R.id.editText12);
    }

    private void vacio(String sangre, String edad, String hospital){
            if (TextUtils.isEmpty(sangre)||TextUtils.isEmpty(edad)||TextUtils.isEmpty(hospital)||(m.isChecked()==false&&h.isChecked()==false)){
                Toast.makeText(this,"Faltan datos necesarios",Toast.LENGTH_SHORT).show();
            }else {
                Intent menu = new Intent(this,menu_epi.class);
                menu.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(menu);
            }
    }
}
