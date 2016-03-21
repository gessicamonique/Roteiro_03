package com.example.sonyvaio.projetocarros_gessica;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SplashScreen extends AppCompatActivity implements Runnable{

    private static int DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ocultarBarraDeNavegação();

        Handler h = new Handler();
        h.postDelayed(this,DELAY);

    }

    @Override
    public void run() {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN) private void ocultarBarraDeNavegação(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
