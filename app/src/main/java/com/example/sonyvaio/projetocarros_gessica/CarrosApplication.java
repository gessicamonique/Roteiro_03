package com.example.sonyvaio.projetocarros_gessica;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sony vaio on 20/03/2016.
 */
public class CarrosApplication extends Application {

    List<Carro> carros;

    @Override
    public void onCreate() {
        super.onCreate();

        carros = new ArrayList<>();
        criarCarrosPadrao();

    }

    private void criarCarrosPadrao() {
        carros.add(new Carro("BMW", R.drawable.bmw_720));
        carros.add(new Carro("Camaro", R.drawable.camaro));
        carros.add(new Carro("Corvette", R.drawable.corvette));
        carros.add(new Carro("CT6", R.drawable.ct6));
        carros.add(new Carro("DB77", R.drawable.db77));
        carros.add(new Carro("Gallardo", R.drawable.gallardo));
        carros.add(new Carro("Mustang", R.drawable.mustang));
        carros.add(new Carro("Paganni Zonda", R.drawable.paganni_zonda));
        carros.add(new Carro("Porsche", R.drawable.porsche_911));
        carros.add(new Carro("Vyron", R.drawable.vyron));

    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void adicionarCarros() {

        Random random = new Random();
        int numAleatorio = carros.size() > 1 ? random.nextInt(carros.size() - 1) : 0;
        Log.i("tela","numero aleatório" + numAleatorio);
        carros.add(carros.get(numAleatorio));
    }

    public void removerCarros(int position) {

        carros.remove(position);
        String item = Integer.toString(position + 1);
        Toast.makeText(this, "Item removido: " + item, Toast.LENGTH_SHORT).show();
    }

}
