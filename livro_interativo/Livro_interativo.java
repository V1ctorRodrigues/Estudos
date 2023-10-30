package livro_interativo;
import java.util.Scanner;

class Livro_interativo {
    public static void main(String[] args) throws Exception {
        //Escolhas para iniciar
        String escolha1 = "SIM";
        String escolha2 = "NAO";
        String resposta;

        //Criação de scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá! Você está em um livro interativo criado pelo\n" +
                "aluno Victor Rodrigues, eu gostaria de informar\n" +
                "que existem 2 tipos de interação nesse livro: \n" +
                "'*' significa AÇÃO PARA O PERSONAGEM. \n" +
                "'-' significa FALA PARA O PERSONAGEM.\n" +
                "\nVamos começar? -"+ escolha1 + " -" + escolha2 + "\n");

        //Criação de um scanner com o nome Start
        String init = leitor.nextLine();

        //Começar ou não o programa
        if (init.equalsIgnoreCase(escolha1)) {
        }

        //Parar o funcionamento do programa 
        else if(init.equalsIgnoreCase(escolha2)) {
            System.out.println("\nTudo bem, fica para uma próxima :(\n");
            System.exit(0);
        }

        //Corpo com a história
                String cap1 = "Começo do capítulo 1";
                String choisecap1 = "Final 1"; // Para o final 1
                String choise2cap1 = "Cap3"; // Para o cap3

                String cap2 = "Final 1";

                String cap3 = "Começo do capítulo 3";
                String choisecap3 = "Final 2"; // Para o final 2
                String choise2cap3 = "Final 3"; // Para o final 3

                String cap4 = "Final 2";

                String cap5 = "Final 3";

        // Começo do Cap 1        
         System.out.println("\n" + cap1 + "\n");
         System.out.println(choisecap1 + " | " + choise2cap1 + "\n");
        resposta = leitor.nextLine();

        //Final 1
        if(resposta.equalsIgnoreCase(choisecap1)){
          System.out.println(cap2);

        //Capítulo 3
        } else if(resposta.equalsIgnoreCase(choise2cap1)){
                System.out.println("\n" + cap3 + "\n");
                System.out.println(choisecap3 + " | " + choise2cap3 + "\n");
                resposta = leitor.nextLine();  
        //Final 2     
        } if(resposta.equalsIgnoreCase(choisecap3)){
                System.out.println(cap4);
        //Final 3
        } else if(resposta.equalsIgnoreCase(choise2cap3)){
                System.out.println(cap5);
        }
    }
}
