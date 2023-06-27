package livro_interativo;
import java.util.Scanner;
 class Livro_interativo {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Você está em um livro interativo criado pelo\n"+
        "aluno Victor Rodrigues, eu gostaria de informar que existem 2 tipos de\n"+
        "interação: * = Ação escolhida ou - = Fala escolhida. Ok! Era isso.\n"+
        "\nVamos começar?  -  Sim  - Nao\n");
        Scanner começo = new Scanner(System.in);
        String init = começo.nextLine();
        if(init.equalsIgnoreCase("sim")){
            Package livro_interativo;
        } else if(init.equalsIgnoreCase("nao")){
            System.out.println("\nTudo bem, fica pra uma próxima :(\n");
            System.exit(0);
        }

        Scanner response1 = new Scanner(System.in);
            System.out.println("\nBem vindo viajante! Vejo que você está perdido,\n" +
            "pelo visto iremos fazer companhia um para o outro hahaha");
            System.out.println("\n\n"+
            "      O que fará? (Digite sua escolha)\n\n"+
            "-Quem e voce?   -Onde estou?   * Sair correndo\n");
            String choises = response1.nextLine();
            /* Primeira parte das escolhas*/
            if(choises.equalsIgnoreCase("sair correndo")){
           System.out.println("\nVocê se levanta e sai daquele local apressadamente.\n"+
           "A pessoa tenta te avisa que está escuro, mas antes disso você já estava\n"+
           "longe da casa, anda por 300 metros e começa a prestar mais atenção em tudo:\n"+
           "A noite está fria e silenciosa, você está na floresta, não percebe, mas fica\n"+
           "entre lobos famintos, está cansado(a) e sem reflexos, apenas aceita sua morte\n"+
           "como se fosse o mais natural a se fazer\n\nFIM\n");
   
            } else if(choises.equalsIgnoreCase("onde estou?")){
           System.out.println("\nVocê está na minha humilde casa, aparentemente\n"+
           "você foi assaltado, apenas te encontrei no chão e resolvi ajudar\n"+
           "aceita alguma bebida?");
            System.out.println("\n\n"+
            "      O que fará? (Digite sua escolha)\n\n"+
             " *Partir para a briga   -Porque me ajudou?\n");
            // Respostas para parte 2
             String choises2 = response1.nextLine();
           if(choises2.equalsIgnoreCase("porque me ajudou?")){
               System.out.println("\nDigamos que você pode me ajudar em algumas\n"+
               "coisas que eu preciso\n\n\n\nContinua\n");
           }else if(choises2.equalsIgnoreCase("partir para a briga")){
               System.out.println("\nVocê se levanta para lutar, serra os punhos\n"+
               "e parte para cima do mercador, porém ele já havia se adiantado.\n"+
               "Ele saca uma besta, atira uma flecha em você e tudo fica escuro\n"+
               "a ponta da flecha sai um líquido fluorescente e você vai perdendo\n"+
               "cada vez mais as forças, até sucunbir a morte\n\nFIM\n");
           }
           
            }else if(choises.equalsIgnoreCase("quem e voce?")){
           System.out.println("\nSou apenas um antigo mercador, eu cansei\n"+
           "dessa vida de viajante e me aposeitei por aqui mesmo, agora eu\n"+
           "vivo nessas terras sozinho, eventualmente aparecem pessoas desacordadas\n"+
           "como você");
             System.out.println("\n\n"+
            "      O que fará? (Digite sua escolha)\n\n"+
            "-Eu realmente preciso ir, obrigado\n");
            String choises3 = response1.nextLine();
            if(choises3.equalsIgnoreCase("eu realmente preciso ir, obrigado")){
           System.out.println("\nO mercante simplesmente levanta-se e abre a porta\n"+
           "- Certo, mas cuidado com todos os perigos que aparecem sem explicação\n"+
           "por aqui. Ele sorri e espera calmamente você ir embora. Você sai da casa\n"+
           "e conforme anda percebe um sorriso inexplicavelmente macabro do seu anfitrião\n"+
           "\n\nCONTINUA");
        }
        }
        }
    }