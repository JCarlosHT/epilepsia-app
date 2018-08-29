package com.example.juan.epilepsia;

import java.io.Serializable;

public class datos_prim implements Serializable{
    private String nombre;
    private String apelli_pater;
    private String apelli_mater;
    private String correo;
    private String Us_nom;
    private String contra;
    private String Us_nom_conta;

    public datos_prim() {
        this.nombre = "";
        this.apelli_pater = "";
        this.apelli_mater = "";
        this.correo = "";
        Us_nom = "";
        this.contra = "";
        Us_nom_conta = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelli_pater() {
        return apelli_pater;
    }

    public void setApelli_pater(String apelli_pater) {
        this.apelli_pater = apelli_pater;
    }

    public String getApelli_mater() {
        return apelli_mater;
    }

    public void setApelli_mater(String apelli_mater) {
        this.apelli_mater = apelli_mater;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUs_nom() {
        return Us_nom;
    }

    public void setUs_nom(String us_nom) {
        Us_nom = us_nom;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUs_nom_conta() {
        return Us_nom_conta;
    }

    public void setUs_nom_conta(String us_nom_conta) {
        Us_nom_conta = us_nom_conta;
    }
}
