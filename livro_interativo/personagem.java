package livro_interativo;

public class personagem {
    //Atributos da classe
    String name;
    int pontosDeVida;

    //Construtor da classe - testes ok
public personagem(String name, int pontosDeVida){
    this.name = name;
    this.pontosDeVida = pontosDeVida;
    }

    void alterarVida(int alteracaoVida){
        this.pontosDeVida += alteracaoVida;
        System.out.println("\n"+this.name + " sofreu uma perda de " + alteracaoVida);
        if(this.pontosDeVida > 10){
            this.pontosDeVida = 10;
        }
        if(this.pontosDeVida < 0){
            this.pontosDeVida = 0;
            System.out.print("O personagem " + this.name + " morreu.");
        }

    }
}
