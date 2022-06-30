package com.anmoraque.puntuamisfotos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.anmoraque.puntuamisfotos.util.GestionPreferencias;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private AdapterFragmentos adapterFragmentos;
    private LinearLayout caja_estrella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Este es como el recycler para las listas/es como el marco
        this.viewPager2 = findViewById(R.id.viewpager);
        this.adapterFragmentos = new AdapterFragmentos(this);
        //le digo al viewPager: este adapter, te va a IR DANDO LOS FRAGMETS/pantallas
        this.viewPager2.setAdapter(this.adapterFragmentos);
        //Le digo al LinearLayout que recorra cada ImageView
        this.caja_estrella = findViewById(R.id.cajaEstrella);
        for (int i = 0;i < caja_estrella.getChildCount();i++){
            ImageView imageView = (ImageView) caja_estrella.getChildAt(i);
            //Escucho el ImageView tocado
            imageView.setOnClickListener(this::imagenTocada);
            //Añado un numero de estrellas al ImageView tocado
            imageView.setTag(i+1);


        }
    }
    //Creo el menu personalizado
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_estadisticas, menu);
        return true;
    }
    //Clase para cambiar actividad
    private void navegarAPantalla (Class actividad_destino)
    {
        Intent intent_pantalla = new Intent(this, actividad_destino);
        startActivity(intent_pantalla);
    }
    //Sobreescribo este método, para recibir las opciones de menú estadisticas
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.opcion_estadisticas:
                navegarAPantalla(EstadisticasActivity.class);
                break;
        }
    return super.onOptionsItemSelected(item);
    }

    // Programo el listener de todos los ImageView
    // y guardarlo para la actividad Estadisticas
    public void imagenTocada(View view)
    {

        //Gracias al getCurrentItem se que foto esta en pantalla
        int n_foto = this.viewPager2.getCurrentItem();
        //Recupero el numero guardado de cada imageView para saber la puntuacion
        int n_puntuacion = (int) view.getTag();
        Log.d("ETIQUETA_LOG", "Foto que obtiene la puntuacion= "+ n_foto);
        Log.d("ETIQUETA_LOG", "Puntuacion= "+ n_puntuacion);
        Toast.makeText(this, "Has dado de puntuación un " + n_puntuacion, Toast.LENGTH_SHORT).show();

        //Paso las fotos automaticamente cada vez que puntua
        if ((n_foto + 1)==this.adapterFragmentos.getItemCount())
        {
            //Pongo un Toast avisando que has terminado de puntuar todas
            //Toast.makeText(this, "Has terminado de puntuar todas las fotos", Toast.LENGTH_LONG).show();
            irAEstadisticas ();
        } else {
            //Cambio de foto
            this.viewPager2.setCurrentItem(n_foto+1);

            //Guardamos n_foto con su n_puntuacion
            switch (n_foto){
                case 0: GestionPreferencias.guardarPreferenciaFoto1(this, n_puntuacion+"");
                    break;
                case 1: GestionPreferencias.guardarPreferenciaFoto2(this, n_puntuacion+"");
                    break;
                case 2: GestionPreferencias.guardarPreferenciaFoto3(this, n_puntuacion+"");
                    break;
                case 3: GestionPreferencias.guardarPreferenciaFoto4(this, n_puntuacion+"");
                    break;
                case 4: GestionPreferencias.guardarPreferenciaFoto5(this, n_puntuacion+"");
                    break;
            }

        }

    }

    //Metodo para lanzar un intent para visitar la pantalla de estadísticas
    private void  irAEstadisticas ()
    {
        Intent intent_estadisticas = new Intent(this, EstadisticasActivity.class);
        startActivity(intent_estadisticas);
    }

}