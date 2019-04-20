package com.jhonatasrm.exemplo_lista_personalizada.model;

public class Carros {

    String modelo;
    String marca;
    int ano;
    CorCarro corCarro;
    StatusCarro statusCarro;
    int fotoCarro;

    public Carros(String modelo, String marca, int ano, CorCarro corCarro, StatusCarro statusCarro, int fotoCarro) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.corCarro = corCarro;
        this.statusCarro = statusCarro;
        this.fotoCarro = fotoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public CorCarro getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(CorCarro corCarro) {
        this.corCarro = corCarro;
    }

    public StatusCarro getStatusCarro() {
        return statusCarro;
    }

    public void setStatusCarro(StatusCarro statusCarro) {
        this.statusCarro = statusCarro;
    }

    public int getFotoCarro() {
        return fotoCarro;
    }

    public void setFotoCarro(int fotoCarro) {
        this.fotoCarro = fotoCarro;
    }
}
