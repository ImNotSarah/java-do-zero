package com.sarahlima.aprendendojavadozero.scratches;

class Scratch {
public static void main(String[] args) {
//        String nome;

//        nome = "Sarah Lima";
//        //Integer idade = 19;
//        final Double PI = 3.14;

    //idade = 50;
//        byte idade = 52;
//        int numeroCasa = 360;
//        float preco = 34.96f;
//        double total = 456.8967;
//        boolean visivel = true;
//        char caracter = 'F';
//
//        System.out.println("Nome: " + nome);
//        System.out.println("Casa: " + numeroCasa);
//        System.out.println("PI: " + PI);
//        System.out.println("Preco: " + preco);
//        System.out.println("Total: " + total);
//        System.out.println("Boolean: " + visivel);
//        System.out.println("Sexo: " + caracter)

//          double compras = 400;
//          byte idade = 55;
//          boolean resultado = compras >= 300 && idade >= 50;
//        System.out.println("Resultado: " + resultado);
//          if (resultado){
//              System.out.println("Desconto de 30%");
//          }else {
//              System.out.println("Não tem desconto");
//          }

//        int numero1 = 10;
//        int numero2 = 20;
//        if(numero1 > numero2){
//            System.out.println(numero1 + " é maior que " + numero2);
//        }else if(numero2 > numero1){
//            System.out.println(numero2 + " é maior que " + numero1);
//        }else{
//            System.out.println("Os número são iguais");
//        }

//        int idade = 12;
//        // OPERADOR TERNÁRIO
//        String texto = idade >= 18 ? "Maior idade" : "Menor idade";
//        System.out.println("Resultado: " + texto);
//
//        int opcao = 3;
//        switch (opcao){
//            case 1:
//                System.out.println("Saldo atual");
//                break;
//            case 2:
//                System.out.println("Extrato");
//                break;
//            case 3:
//                System.out.println("Cartões de crédito");
//                break;
//            default:
//                System.out.println("Nenhuma opção selecionada");
//        }
//        String nome = "Sarah";
//        String[] nomes = {"Sarah", "Jamilton", "Pedro", "Rita"};
//        int[] numeros = {200, 500, 800, 1000};
//
    int numero = 1;
    while (numero <= 5) {
        System.out.println("Número: " + numero);
        numero++;
    }
    System.out.println();

    String[] postagens = {
            "Fui a praia...",
            "Fazendo trilha...",
            "Viagem para Nordeste",
            "Estudando Java e Kotlin",
    };
    System.out.println("Resultado: " + postagens[1]);

    numero = 0;

    while (numero <= 3) {
        System.out.println("-" + postagens[numero]);
        System.out.println("------------");
        numero++;
    }
    System.out.println();
    for (int i = 0; i < 6; i++) {
        System.out.println("Resultado: " + i);
    }
    System.out.println();
    numero = 1;

    do {
        System.out.println("numero: " + numero);
        numero++;
    }while(numero <= 5);
}
}