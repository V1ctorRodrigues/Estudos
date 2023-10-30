package livro_interativo;
import java.util.Scanner;

class Livro_interativo {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Você está em um livro interativo criado pelo\n" +
                "aluno Victor Rodrigues, eu gostaria de informar\n" +
                "que existem 2 tipos de interação nesse livro: \n" +
                "'*' significa AÇÃO PARA O PERSONAGEM \n" +
                "'-' significa FALA PARA O PERSONAGEM.\n" +
                "\nVamos começar?  -  Sim  - Nao\n");
        //Criação de um scanner com o nome Start
        Scanner leitor = new Scanner(System.in);
        String init = leitor.nextLine();
        //Começar ou não o programa
        if (init.equalsIgnoreCase("sim")) {
        }
        //Parar o funcionamento do programa 
        else {
            System.out.println("\nTudo bem, fica para uma próxima :(\n");
            System.exit(0);
        }
        //Capta todas as respostas
                String resposta;

        //Corpo com a história
                String cap1 = "Começo do capítulo 1";
                String choisecap1 = "Vai para o final 1"; // Para o final 1
                String choise2cap1 = "Vai para o cap3"; // Para o cap3

                String cap2 = "Começo do capítulo 2 - Final 1";

                String cap3 = "Começo do capítulo 3";
                String choisecap3 = "Vai para o final 2"; // Para o final 2
                String choise2cap3 = "Vai para o final 3"; // Para o final 3

                String cap4 = "Começo do capítulo 4 - Final 2";

                String cap5 = "Começo do capítulo 4 - Final 3";

        // Começo do Cap 1        
        System.out.println("\n" + cap1 + "\n");
        System.out.println(choisecap1 + " | " + choise2cap1 + "\n");
        // Registrando escolha
        resposta = leitor.nextLine();
        if(resposta == choisecap1){
          System.out.println(cap2);
        } else if(resposta == choise2cap1){
                System.out.println("\n" + cap3 + "\n");
                System.out.println(choisecap3 + " | " + choise2cap3 + "\n");
                resposta = leitor.nextLine();       
        } if(resposta == choisecap3){
                System.out.println(cap4);
        } else if(resposta == choise2cap3){
                System.out.println(cap5);
        }
    }
}
