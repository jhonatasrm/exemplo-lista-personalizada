package com.jhonatasrm.exemplo_lista_personalizada.model;

public enum CorCarro {
    VERMELHO {
        @Override
        public String toString() {
            return "Vermelho";
        }
    },
    VERDE {
        @Override
        public String toString() {
            return "Verde";
        }
    },
    AZUL {
        @Override
        public String toString() {
            return "Azul";
        }
    },
    PRETO {
        @Override
        public String toString() {
            return "Preto";
        }
    },
    BRANCO {
        @Override
        public String toString() {
            return "Branco";
        }
    },
    PRATA {
        @Override
        public String toString() {
            return "Prata";
        }
    }
}
