package com.anmoraque.puntuamisfotos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
//Metodo Adapter para usar en el Fragment
public class AdapterFragmentos extends FragmentStateAdapter {
    //Creo un array con todas las fotos
    private int[] array_fotos = {

            R.drawable.foto_uno, R.drawable.foto_dos, R.drawable.foto_tres,
            R.drawable.foto_cuatro, R.drawable.foto_cinco
    };

    public AdapterFragmentos(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment = null;
        fragment = new MiFragmento();
        Bundle bundle = new Bundle();
        //Busco la posicion del array_fotos
        int pos_array = this.array_fotos[position];
        //Guardo la posicion en el bundle
        bundle.putInt("FOTOS", pos_array);
        //El bundle que meto aquí, lo puedo obtener en el OncreateView con getArguments
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getItemCount() {
        return array_fotos.length;//voy a dibujar, 5 pantallas
    }
}
