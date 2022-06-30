package com.anmoraque.puntuamisfotos.util;

import android.content.Context;
import android.content.SharedPreferences;


public class GestionPreferencias {

    //leer Preferencia de foto1
    public static int leerPreferenciaFoto1 (Context context)
    {
        int foto1 = 0;
        String foto1_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto1_aux = fichero_prefs.getString("Foto1","0");
        foto1 = Integer.parseInt(foto1_aux);

        return foto1;

    }
    //guardar Preferencia de foto1
    public static void guardarPreferenciaFoto1 (Context context, String foto1)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Foto1", foto1);
        editor.commit();
    }
    //leer Preferencia de foto2
    public static int leerPreferenciaFoto2 (Context context)
    {
        int foto2 = 0;
        String foto2_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto2_aux = fichero_prefs.getString("Foto2","0");
        foto2 = Integer.parseInt(foto2_aux);

        return foto2;

    }
    //guardar Preferencia de foto2
    public static void guardarPreferenciaFoto2 (Context context, String foto2)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Foto2", foto2);
        editor.commit();
    }
    //leer Preferencia de foto3
    public static int leerPreferenciaFoto3 (Context context)
    {
        int foto3 = 0;
        String foto3_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto3_aux = fichero_prefs.getString("Foto3","0");
        foto3 = Integer.parseInt(foto3_aux);

        return foto3;

    }
    //guardar Preferencia de foto3
    public static void guardarPreferenciaFoto3 (Context context, String foto3)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Foto3", foto3);
        editor.commit();
    }
    //leer Preferencia de foto4
    public static int leerPreferenciaFoto4 (Context context)
    {
        int foto4 = 0;
        String foto4_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto4_aux = fichero_prefs.getString("Foto4","0");
        foto4 = Integer.parseInt(foto4_aux);

        return foto4;

    }

    //guardar Preferencia de foto4
    public static void guardarPreferenciaFoto4 (Context context, String foto4)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Foto4", foto4);
        editor.commit();
    }
    //leer Preferencia de foto5
    public static int leerPreferenciaFoto5 (Context context)
    {
        int foto5 = 0;
        String foto5_aux = null;

        SharedPreferences fichero_prefs = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        foto5_aux = fichero_prefs.getString("Foto5","0");
        foto5 = Integer.parseInt(foto5_aux);

        return foto5;

    }

    //guardar Preferencia de foto5
    public static void guardarPreferenciaFoto5 (Context context, String foto5)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs_fotos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Foto5", foto5);
        editor.commit();
    }



}
