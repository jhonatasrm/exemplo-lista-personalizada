package com.jhonatasrm.exemplo_lista_personalizada.model;

public enum StatusCarro {
    VENDIDO {
        @Override
        public String toString() {
            return "Vendido";
        }
    }, AVENDA {
        @Override
        public String toString() {
            return "À Venda";
        }
    }
}
