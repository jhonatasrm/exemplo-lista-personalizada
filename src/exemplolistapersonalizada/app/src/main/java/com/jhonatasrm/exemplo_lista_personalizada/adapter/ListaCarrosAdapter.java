package com.jhonatasrm.exemplo_lista_personalizada.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jhonatasrm.exemplo_lista_personalizada.R;
import com.jhonatasrm.exemplo_lista_personalizada.model.Carros;
import com.jhonatasrm.exemplo_lista_personalizada.model.StatusCarro;

import java.util.List;

public class ListaCarrosAdapter extends BaseAdapter {

    private final List<Carros> carros;
    private final Activity activity;
    private TextView modelo;
    private TextView marca;
    private TextView statusCarro;
    private TextView ano;
    private TextView corCarro;
    private ImageView foto;

    public ListaCarrosAdapter(List<Carros> carros, Activity activity) {
        this.carros = carros;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_carros, parent, false);

        final Carros carro = carros.get(position);

        // identificar TextView's
        modelo = view.findViewById(R.id.modelo);
        marca = view.findViewById(R.id.marca);
        ano = view.findViewById(R.id.ano);
        corCarro = view.findViewById(R.id.corCarro);
        foto = view.findViewById(R.id.fotoCarro);
        statusCarro = view.findViewById(R.id.statusCarro);

        // verificar se carro está vendido e alterar o background de acordo
        if (carro.getStatusCarro() == StatusCarro.VENDIDO) {
            statusCarro.setBackgroundColor(view.getResources().getColor(R.color.colorRed));
        } else {
            statusCarro.setBackgroundColor(view.getResources().getColor(R.color.colorGreen));
        }

        modelo.setText(carro.getModelo());
        marca.setText(carro.getMarca());
        ano.setText(String.valueOf(carro.getAno()));
        corCarro.setText(String.valueOf(carro.getCorCarro()));
        foto.setImageResource(carro.getFotoCarro());
        statusCarro.setText(String.valueOf(carro.getStatusCarro()));

        // evento de clicar na posição da lista
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), ""+carro.getModelo()+"\n"+carro.getMarca()+"\n"+carro.getAno()+"\n"+carro.getCorCarro()+"\n"+carro.getStatusCarro(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}