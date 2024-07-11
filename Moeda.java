package cofrinho;
//Classe abstrata Moeda que define as propriedades básicas de uma moeda
public abstract class Moeda {
    
    private double valor;    
    private String nome;
    // Construtor que recebe o valor e o nome da moeda
    public Moeda(double valor, String nome) {
        this.valor = valor;        
        this.nome = nome;
    }
    // Método para retornar o valor da moeda
    public double infoValor() {
        return valor;
    }    
    // Método para retornar o nome da moeda    
    public String infoNome() {
        return nome;
    }
    // Método abstrato para conversão das moedas
    public abstract double converter();
                
    
}



