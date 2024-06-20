package com.teresabat.logica;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        String frase = "hoje é segunda feira";


        if (frase.contains("segunda feira")){
            // executo codigo daqui
            System.out.println("tristeza");
        }else{
            // executo aqui qunado falso
            System.out.println("dia normal");
        }
    }
}
