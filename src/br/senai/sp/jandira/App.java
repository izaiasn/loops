package br.senai.sp.jandira;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] carros = {"x1", "fusca","ferrari", "uno"};

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("-/    Bem vindo      /-");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-");

        System.out.print("Escolha seu carro: ");
        boolean validar = false;
        String escolhido = null;
        String opcaoUsuario = teclado.nextLine();
        for (int i=0; i<carros.length; i++){
            if (opcaoUsuario.equalsIgnoreCase(carros[i])){
                escolhido = carros[i];
                System.out.println("Veiculo disponível! "+ escolhido);
                validar = true;
            }
        }
        if (!validar){
            System.out.println("Veiculo não encontrado");
        }



        // exemplo For
//        for(int i= 0; i<10; i++){
//            System.out.println("Java na veia");
//
//        }

        // exemplo while
//
//        boolean teste = true;
//        while (teste){
//            System.out.println(carros.length);
//            teste=false;
//        }
        // Exemplo dowhile
//        boolean testeDo = false;
//        do {
//            System.out.println(" Amo Senai Jandira");
//        }while (testeDo);
    }
}
