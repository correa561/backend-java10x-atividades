package Atividades;

public class DESAFIO_01 {
    public static void main(String[] args) {

        String nomeNinja01 = "Naruto Uzumaki";
        int idadeNinja01 = 12;
        String aldeiaNinja01 = "Aldeia da folha";
        String nomeDaMissaoNinja01 = "Entrega de Mensagens – Levar um pergaminho confidencial da Vila para um posto avançado próximo.";
        char nivelDeDificuldadeNinja01 = 'D';


        /*--------------------------------------------------*/

        String nomeNinja02 = "Sasuke Uchiha";
        int idadeNinja02 = 12;
        String aldeiaNinja02 = "Aldeia da folha";
        String nomeDaMissaoNinja02 = "Defesa de Posto Avançado – Proteger uma fortaleza contra um ataque inimigo iminente.";
        char nivelDeDificuldadeNinja02 = 'B';


        /*--------------------------------------------------*/

        String nomeNinja03 = "Kakashi Hatake";
        int idadeNinja03 = 27;
        String aldeiaNinja03 = "Aldeia da folha";
        String nomeDaMissaoNinja03 = "Recuperação de Artefato Proibido – Roubar ou destruir um objeto de poder perigoso antes que caia em mãos erradas.";
        char nivelDeDificuldadeNinja03 = 'A';


        /*--------------------------------------------------*/
        System.out.println("--------------------FICHARIO NINJA--------------------");
        System.out.println("Nome: " + nomeNinja01);
        System.out.println("Idade: " + idadeNinja01);
        System.out.println("Aldeia: " + aldeiaNinja01);
        System.out.println("Missão: " + nomeDaMissaoNinja01);
        System.out.println("Dificuldade: " + nivelDeDificuldadeNinja01);

        if (idadeNinja01 < 15) ;
        {
            if (nivelDeDificuldadeNinja01 == 'D' || nivelDeDificuldadeNinja01 == 'C') {
                System.out.println("Pré requisitos: Ok, idade : " + idadeNinja01 + " e Dificuldade: " + nivelDeDificuldadeNinja01);
            } else if (idadeNinja01>15) {
                System.out.println("Pré requisitos: Ok, idade : " + idadeNinja01 + " e Dificuldade: " + nivelDeDificuldadeNinja01);
            }else{
                System.out.println("Pré requisitos: Missão não autorizada! por falta de idade!");
            }
        }

            System.out.println("------------------------------------------------------");


            System.out.println("--------------------FICHARIO NINJA--------------------");
            System.out.println("Nome: " + nomeNinja02);
            System.out.println("Idade: " + idadeNinja02);
            System.out.println("Aldeia: " + aldeiaNinja02);
            System.out.println("Missão: " + nomeDaMissaoNinja02);
            System.out.println("Dificuldade: " + nivelDeDificuldadeNinja02);

            if (idadeNinja02 < 15) ;
            {
                if (nivelDeDificuldadeNinja02 == 'D' || nivelDeDificuldadeNinja02 == 'C') {
                    System.out.println("Pré requisitos: Ok, idade : " + idadeNinja02 + " e Dificuldade: " + nivelDeDificuldadeNinja02);
                } else if (idadeNinja02>15) {
                    System.out.println("Pré requisitos: Ok, idade : " + idadeNinja02 + " e Dificuldade: " + nivelDeDificuldadeNinja02);
                }else{
                    System.out.println("Pré requisitos: Missão não autorizada! por falta de idade!");
                }
            }

        System.out.println("------------------------------------------------------");


            System.out.println("--------------------FICHARIO NINJA--------------------");
            System.out.println("Nome: " + nomeNinja03);
            System.out.println("Idade: " + idadeNinja03);
            System.out.println("Aldeia: " + aldeiaNinja03);
            System.out.println("Missão: " + nomeDaMissaoNinja03);
            System.out.println("Dificuldade: " + nivelDeDificuldadeNinja03);
            if (idadeNinja03 < 15) ;
            {
                if (nivelDeDificuldadeNinja03 == 'D' || nivelDeDificuldadeNinja03 == 'C') {
                    System.out.println("Pré requisitos: Ok, idade : " + idadeNinja03 + " e Dificuldade: " + nivelDeDificuldadeNinja03);
                } else if (idadeNinja03>15) {
                    System.out.println("Pré requisitos: Ok, idade : " + idadeNinja03 + " e Dificuldade: " + nivelDeDificuldadeNinja03);
                }else{
                    System.out.println("Pré requisitos: Missão não autorizada! por falta de idade!");
                }
            }
            System.out.println("------------------------------------------------------");


        }
    }


