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

    void alterarVida(){
        this.pontosDeVida -= 1;
        System.out.println(this.name + "Sofreu uma perda de " + this.pontosDeVida);
        if(this.pontosDeVida > 10){
            this.pontosDeVida = 10;
        }
        if(this.pontosDeVida < 0){
            this.pontosDeVida = 0;
        }

    }
}
