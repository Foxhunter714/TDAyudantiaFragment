package com.example.tdayudantiafragments.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.tdayudantiafragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, ListBookFragment.newInstance("", ""), "listFragment").commit();
    }

    @Override
    public void onBackPressed() {
        //fragment anterior, el cual se quiere dejar de mostrar
        Fragment oldFragment = getSupportFragmentManager().findFragmentByTag("detailsFr");
        //Si no hay un fragment de detalle, cerrar la app
        if (oldFragment == null){
            super.onBackPressed();
        }
        //si hay fragmento de detalle, quitarlo y poner el de lista
        else{
            getSupportFragmentManager().beginTransaction().add(R.id.container, ListBookFragment.newInstance("", ""), "listFragment")
                    .remove(oldFragment).commit();
        }

    }
}