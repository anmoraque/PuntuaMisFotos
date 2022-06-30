package com.anmoraque.puntuamisfotos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MiFragmento extends Fragment {

    //En este método es donde se infla el fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragment = null;
        fragment = inflater.inflate(R.layout.mis_fotos, container, false);
        //Obtengo el bundle que me han pasado
        Bundle bundle = getArguments();
        int n = bundle.getInt("FOTOS");
        //imageView dentro del fragment del layout
        ImageView imageView = fragment.findViewById(R.id.fotos);
        //Le añado las FOTOS
        imageView.setImageResource(n);

        return fragment;
    }
}