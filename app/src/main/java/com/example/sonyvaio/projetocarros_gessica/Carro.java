package com.example.sonyvaio.projetocarros_gessica;

/**
 * Created by sony vaio on 20/03/2016.
 */
public class Carro {
    String nomeCarro;
    int idImageCarro;

    public Carro(String nomeCarro, int idImageCarro) {
        this.nomeCarro = nomeCarro;
        this.idImageCarro = idImageCarro;
    }

    public String getNomeCarro() {

        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {

        this.nomeCarro = nomeCarro;
    }

    public int getIdImageCarro() {

        return idImageCarro;
    }

    public void setIdImageCarro(int idImageCarro) {

        this.idImageCarro = idImageCarro;
    }
}
