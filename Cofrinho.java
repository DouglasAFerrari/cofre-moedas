package cofrinho;

import java.util.ArrayList;

//Classe que representa o cofrinho de moedas
public class Cofrinho {

    private ArrayList<Moeda> listaMoedas;// Lista de moedas no cofrinho
    
    public Cofrinho() {
        this.listaMoedas = new ArrayList<Moeda>();
    }
    // Adiciona uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }
    // Remove uma moeda específica do cofrinho
    public void remover(int indice) {
        this.listaMoedas.remove(indice);
    }
    // Lista todas as moedas no cofrinho
    public ArrayList<Moeda> listagemMoedas() {
        return this.listaMoedas;
    }
    // Calcula o valor total do cofrinho em reais, convertendo as moedas para real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : this.listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}




