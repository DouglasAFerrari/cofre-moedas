package cofrinho;

//Classe que representa o Dólar, que estende a classe Moeda
public class Dolar extends Moeda {
    
    public Dolar(double valor, String nome) {
        super(valor, nome);
    }
    
    // Implementação do método abstrato converter() para retornar o valor em reais
    @Override
    public double converter() {
        return this.infoValor() * 5.20; 
    }    
    
}



