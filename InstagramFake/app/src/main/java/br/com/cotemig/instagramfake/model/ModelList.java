package br.com.cotemig.instagramfake.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dirceu on 06/04/2018.
 */

public class ModelList {

    private List<ModelPost> lista;
    private boolean sucesso;

    public List<ModelPost> getLista() {
        return lista;
    }

    public void setLista(List<ModelPost> lista) {
        this.lista = lista;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }
}
