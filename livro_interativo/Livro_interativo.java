package livro_interativo;
import java.util.Scanner;

class Livro_interativo {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Você está em um livro interativo criado pelo\n" +
                "aluno Victor Rodrigues, eu gostaria de informar que existem 2 tipos de\n" +
                "interação: * significa Ação escolhida ou - significa Fala escolhida.\n" +
                "\nVamos começar?  -  Sim  - Nao\n");
        //Criação de um scanner com o nome Start
        Scanner start = new Scanner(System.in);
        String init = start.nextLine();
        //Começar ou não o programa
        if (init.equalsIgnoreCase("sim")) {
        }
        //Parar o funcionamento do programa 
        else {
            System.out.println("\nTudo bem, fica para uma próxima :(\n");
            System.exit(0);
        }
        //Corpo com a história
                String resposta;

                String cap1 = "Começo do capítulo 1";
                String choisecap1 = "Primeira escolha";
                String chois2cap1 = "Segunda escolha";

                String cap2 = "Começo do capítulo 2 - Final 1";

                String cap3 = "Começo do capítulo 3";
                String choisecap3 = "Primeira escolha";
                String chois2cap3 = "Segunda escolha";

                String cap4 = "Começo do capítulo 4 - Final 2";
                String choisecap4 = "Primeira escolha";
                String chois2cap4 = "Segunda escolha";

                String cap5 = "Começo do capítulo 4 - Final 3";
                String choisecap5 = "Primeira escolha";
                String chois2cap5 = "Segunda escolha";
                
                System.out.println("");
                System.out.println("");
                System.out.println("");


    }
}
