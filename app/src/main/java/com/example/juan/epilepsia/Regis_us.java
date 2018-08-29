package com.example.juan.epilepsia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Regis_us extends AppCompatActivity {
    private EditText nombre,apellidos,correo,contra,nombre_usu,Con;
    public datos_prim datosPrim=new datos_prim();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_us);
        ini();
        Bundle datos = this.getIntent().getExtras();
        int re=datos.getInt("Parametro");

        if (re==2){
              Con.setVisibility(View.INVISIBLE);
        }

    }

    private void ini(){
        nombre=(EditText) findViewById(R.id.editText);
        apellidos=(EditText) findViewById(R.id.editText2);
        contra=(EditText) findViewById(R.id.editText5);
        nombre_usu=(EditText) findViewById(R.id.editText4);
        correo=(EditText) findViewById(R.id.editText3);
        Con=(EditText) findViewById(R.id.Con);
    }

    public void Per_me(View view){
        String n=nombre.getText().toString();
        String a=apellidos.getText().toString();
        String co=correo.getText().toString();
        String con=contra.getText().toString();
        String nu=nombre_usu.getText().toString();
        Bundle datos = this.getIntent().getExtras();
        int re=datos.getInt("Parametro");
        vacios(n,a,con,nu,co,re);

    }

    private void vacios(String nom,String ape,String con,String nom_us,String corr,int re){
        if (TextUtils.isEmpty(nom)|| TextUtils.isEmpty(ape)||TextUtils.isEmpty(con)||TextUtils.isEmpty(nom_us)||TextUtils.isEmpty(corr)){
            Toast.makeText(this,"Complete todos los datos",Toast.LENGTH_SHORT).show();

        }else if (re==2){
            datosPrim.setNombre(nom);
            datosPrim.setApelli_pater(ape);
            datosPrim.setContra(con);
            datosPrim.setUs_nom(nom_us);
            datosPrim.setCorreo(corr);
            Intent Per =new Intent(this,Perfil_medico.class);
            Bundle bundle=new Bundle();
            bundle.putSerializable("datos_pri",datosPrim);
            Per.putExtras(bundle);
            startActivity(Per);

        }else {
            Toast.makeText(this,"AAAAAAAAAAAAAAAAAAAH",Toast.LENGTH_SHORT).show();

        }

    }



}
