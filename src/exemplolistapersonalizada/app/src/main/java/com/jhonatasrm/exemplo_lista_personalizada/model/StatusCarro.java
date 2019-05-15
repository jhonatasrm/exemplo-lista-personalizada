package com.jhonatasrm.exemplo_lista_personalizada.model;

// enum que retorna uma string se o carro foi vendido ou ainda está disponível para venda
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
