package com.jhonatasrm.exemplo_lista_personalizada.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.jhonatasrm.exemplo_lista_personalizada.R;
import com.jhonatasrm.exemplo_lista_personalizada.adapter.ListaCarrosAdapter;
import com.jhonatasrm.exemplo_lista_personalizada.model.Carros;
import com.jhonatasrm.exemplo_lista_personalizada.model.CorCarro;
import com.jhonatasrm.exemplo_lista_personalizada.model.StatusCarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.lista_carros);

        lista = findViewById(R.id.list_view);
        List<Carros> carros = inicializarCarros();
        ListaCarrosAdapter carrosAdapter = new ListaCarrosAdapter(carros, this);
        lista.setAdapter(carrosAdapter);
    }

    // inicialização dos carros para a lista
    public List<Carros> inicializarCarros(){
        return new ArrayList<>(Arrays.asList(new Carros("Fiesta", "Ford", 2008, CorCarro.BRANCO, StatusCarro.VENDIDO, R.drawable.fiesta2008),
                new Carros("Gol", "Volkswagen", 2014, CorCarro.VERMELHO, StatusCarro.AVENDA,R.drawable.gol2014),
                new Carros("EcoSport", "Volkswagen", 2016, CorCarro.AZUL, StatusCarro.AVENDA, R.drawable.ecosport2016),
                new Carros("S10","Ford", 2017, CorCarro.BRANCO, StatusCarro.AVENDA, R.drawable.s102017),
                new Carros("Siena", "Fiat", 2019, CorCarro.PRATA, StatusCarro.VENDIDO, R.drawable.siena2019),
                new Carros("Uno", "Fiat", 2019, CorCarro.VERDE, StatusCarro.VENDIDO, R.drawable.uno2019),
                new Carros("Onix", "Ford", 2019, CorCarro.PRATA, StatusCarro.AVENDA, R.drawable.onix2019),
                new Carros("Celta", "Ford", 2007, CorCarro.VERMELHO, StatusCarro.AVENDA,R.drawable.celta2007),
                new Carros("Ka", "Ford", 2003, CorCarro.PRETO, StatusCarro.VENDIDO, R.drawable.ka2003),
                new Carros("Prisma", "Chevrolet", 2009, CorCarro.PRATA, StatusCarro.AVENDA, R.drawable.prisma2009),
                new Carros("Palio", "Fiat", 2008, CorCarro.AZUL, StatusCarro.VENDIDO, R.drawable.palio2008)));
    }
}
