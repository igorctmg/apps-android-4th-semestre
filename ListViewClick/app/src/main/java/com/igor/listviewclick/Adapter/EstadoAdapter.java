package com.igor.listviewclick.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.igor.listviewclick.R;

import java.util.List;

/**
 * Created by 71600388 on 12/03/2018.
 */

public class EstadoAdapter extends BaseAdapter {

    Context context;
    List<String> estados;

    public EstadoAdapter(Context context, List<String> estados) {
        this.context = context;
        this.estados = estados;
    }

    @Override
    public int getCount() {
        return estados.size();
    }

    @Override
    public Object getItem(int position) {
        return estados.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String estado = estados.get(position);

        // Obtem o objeto inflater responsavel por inflar o meu layout xml
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // inflando xml criado para cada item
        View view = inflater.inflate(R.layout.item_estado, null);

        TextView nome = view.findViewById(R.id.nome);

        nome.setText(estado);

        return view;
    }

}
