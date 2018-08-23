package com.example.juan.epilepsia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Regis_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_us);
    }

    public void Per_me(View view){
        Intent Per =new Intent(this,Perfil_medico.class);
        startActivity(Per);
    }

}
