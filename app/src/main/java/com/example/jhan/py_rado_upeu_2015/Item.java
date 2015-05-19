package com.example.jhan.py_rado_upeu_2015;

/**
 * Created by JOEL on 19/05/2015.
 */
public class Item {
    String name_apellidos, nota;

    public Item(String name_apellidos,String nota) {
        this.name_apellidos = name_apellidos;
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getName_apellidos() {
        return name_apellidos;
    }

    public void setName_apellidos(String name_apellidos) {
        this.name_apellidos = name_apellidos;
    }
}
