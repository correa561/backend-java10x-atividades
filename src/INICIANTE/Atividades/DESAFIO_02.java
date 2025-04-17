package Atividades;

import java.util.Scanner;

public class DESAFIO_02 {
    public static void main(String[] args) {

        // Contadores

        int opcaoDoUsuario = 0;
        int ninjasCadastrados = 0;

        // Array - SCANNER

        int numeroMaximoDeNinjas = 5;
        String[] arrayCadastroDeNinjas = new String[numeroMaximoDeNinjas];
        Scanner input = new Scanner(System.in);


        // Menu ninja foda wow
        while( opcaoDoUsuario != 3){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("");

            // Input para o proseguir

            opcaoDoUsuario = input.nextInt();
            input.nextLine();

            switch (opcaoDoUsuario) {

                case(1):
                    if (ninjasCadastrados < numeroMaximoDeNinjas ){
                        System.out.print("Digite o nome do ninja para cadastrar! ");
                        String nomeDoNinja = input.nextLine();
                        arrayCadastroDeNinjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja: " + nomeDoNinja+" cadastrado com sucesso!");
                    }else{
                        System.out.println("Número máximo de ninjas cadastrados");

                    }
                    break;

                case(2):
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado no sistema!");

                    }else{

                        System.out.println("===== Lista dos ninjas =====");
                        for (int i = 0; i < ninjasCadastrados ; i++) {
                            System.out.println(arrayCadastroDeNinjas[i]);


                        }
                    }
                    break;

                case(3):
                    System.out.println("Encerrando o software!");

                default:
                    System.out.println("Opção invalida, selecione outra!");
            }
        }

        input.close();
}

}
