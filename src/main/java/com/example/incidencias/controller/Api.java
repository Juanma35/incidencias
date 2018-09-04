package com.example.incidencias.controller;

public enum Api {

    ERROR0001("No se puede conectar",0001),
    ERROROOO2("Faltan datos",0002);

    private String s;
    private int i;

  Api(String s, int i) {
this.s=s;
this.i=i;

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
