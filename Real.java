package cofrinho;
//Classe que representa o Real, que estende a classe Moeda
public class Real extends Moeda {
    
    public Real(double valor, String nome) {
        super(valor, nome);
    }
    // Implementação do método abstrato converter() para retornar o valor em reais
    @Override
    public double converter() {
        return this.infoValor();
    }    
    
}





