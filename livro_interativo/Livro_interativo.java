package livro_interativo;

import java.util.Scanner;

class Livro_interativo {

        public static void mostrarTexto(String capitulo, String opcao1, String opcao2) {
                System.out.println("\n" + capitulo + " \n");
                System.out.println(opcao1 + " | " + opcao2 + "\n");
        }

        public static void pontuacaoDano(String personagem, int pontos, int pontosDeVida) {
                System.out.println("O personagem " + personagem + " Sofreu -" +
                                pontos + " de dano e está com: " + (pontosDeVida - pontos) + " Pontos de vida");
        }

        public static void capFinal(String textoFinal) {
                System.out.println("\n" + textoFinal + "\n");
        }

        public static void main(String[] args) throws Exception {
                // Escolhas para iniciar
                String escolha1 = "SIM";
                String escolha2 = "NAO";
                String resposta;

                // Criação de scanner
                Scanner leitor = new Scanner(System.in);

                System.out.println("Olá! Você está em um livro interativo criado pelo\n" +
                                "aluno Victor Rodrigues, eu gostaria de informar\n" +
                                "que existem 2 tipos de interação nesse livro: \n" +
                                "'*' significa AÇÃO PARA O PERSONAGEM. \n" +
                                "'-' significa FALA PARA O PERSONAGEM.\n" +
                                "\nVamos começar? -" + escolha1 + " -" + escolha2 + "\n");

                // Criação de um scanner com o nome Start
                String init = leitor.nextLine();
                // Começar ou não o programa
                if (init.equalsIgnoreCase(escolha1)) {
                }
                // Parar o funcionamento do programa
                else if (init.equalsIgnoreCase(escolha2)) {
                        System.out.println("\nTudo bem, fica para uma próxima :(\n");
                        System.exit(0);
                }
                // Textos para o capítulo 1
                String cap1 = "Começo do capítulo 1";
                String choisecap1 = "Morra"; // Para o final 1
                String choise2cap1 = "Pular"; // Para o cap3
                // Textos para o capítulo 2 - final 1
                String cap2 = "Você morreu";
                // Textos para o capítulo 3
                String cap3 = "Começo do capítulo 3";
                String choisecap3 = "Final 2"; // Para o final 2
                String choise2cap3 = "Final 3"; // Para o final 3
                // Textos para o capítulo 4
                String cap4 = "Final 2";
                // Textos para o capítulo 5
                String cap5 = "Final 3";
                // Começo do Cap 1
                mostrarTexto(cap1, choisecap1, choise2cap1);
                personagem josefina = new personagem("Josefina", 10);
                pontuacaoDano(josefina.name, 10, josefina.pontosDeVida);
                System.out.print(josefina.pontosDeVida);
                boolean escolhaValida = false;
                while (!escolhaValida) {

                        resposta = leitor.nextLine();

                        // Final 1
                        if (resposta.equalsIgnoreCase(choisecap1)) {
                                capFinal(cap2);
                                System.exit(0);
                        }
                        // Capítulo 3
                        else if (resposta.equalsIgnoreCase(choise2cap1)) {
                                mostrarTexto(cap3, choisecap3, choise2cap3);
                                escolhaValida = true;
                                resposta = leitor.nextLine();

                        }
                        // Final 2
                        if (resposta.equalsIgnoreCase(choisecap3)) {
                                capFinal(cap4);
                                System.exit(0);

                        }
                        // Final 3
                        else if (resposta.equalsIgnoreCase(choise2cap3)) {
                                capFinal(cap5);
                                System.exit(0);
                        }
                        // Tratamento de entrada inválida
                        else {
                                escolhaValida = false;
                                System.out.println("Resposta inválida, por favor escolher" +
                                                " uma resposta que o programa mostrou");
                        }
                        leitor.close();
                }

        }

}
