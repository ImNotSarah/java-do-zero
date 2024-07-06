package com.sarahlima.aprendendojavadozero.scratches;

class Jogador{ //Modelo
    //Atributos
    String kart;
    String pneu;
    String planador;

    //Metodo
    void acelerar(){
        System.out.println("Acelerar: " + pneu);
    }

}


class Scratch {
    public static void main(String[] args) {
        //Criar instancia de um objeto
        Jogador sarah = new Jogador();
        sarah.kart = "Normal";
        sarah.pneu = "Cross";
        sarah.planador = "Paraquedas";

        sarah.acelerar();

        Jogador computador = new Jogador();
        computador.pneu = "Avançado";

        computador.acelerar();

        String nome = "Jamilton";
    }
}