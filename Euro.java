package cofrinho;
//Classe que representa o Euro, que estende a classe Moeda
public class Euro extends Moeda {
    
    public Euro(double valor, String nome) {
        super(valor, nome);
    }
    // Implementação do método abstrato converter() para retornar o valor em reais
    @Override
    public double converter() {
        return this.infoValor() * 5.53; 
    }    
    
}


