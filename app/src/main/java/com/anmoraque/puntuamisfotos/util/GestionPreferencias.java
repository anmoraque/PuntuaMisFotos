package com.anmoraque.puntuamisfotos.util;

import android.content.Context;
import android.content.SharedPreferences;


public class GestionPreferencias {

    //guardar Preferencia de foto
    public static void guardarPreferenciafoto (Context context, String foto, String puntuacion) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(foto, puntuacion);
        editor.commit();
    }

    //leer Preferencia de foto
    public static int leerPreferenciaFoto (Context context, String foto)
    {
        int foto1 = 0;
        String foto_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto_aux = fichero_prefs.getString(foto,"0");
        foto1 = Integer.parseInt(foto_aux);

        return foto1;

    }

}
