package cofrinho;

import java.util.ArrayList;
import java.util.Scanner;
//Classe principal responsável por criar o menu e interagir com o usuário.
public class Principal {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        int opcao = -1;
        // Laço para exibir o menu e tratar a opção escolhida pelo usuário
        while (opcao != 0) {        	
        	System.out.println("\n--- COFRINHO ---");
            System.out.println("1. Adicionar moedas");
            System.out.println("2. Remover moedas");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular valor total em reais");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            //captura a escolha do usuário
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	//menu de escolha da moeda
                	System.out.println("Escolha a moeda: ");
                	System.out.println("1. Real");
                    System.out.println("2. Dolar");
                    System.out.println("3. Euro");
                    //captura a escolha da moeda
                    int tipo = scanner.nextInt();
                	System.out.print("Digite o valor: ");
                	//captura o valor
                    double valor = scanner.nextDouble();                                       
                    
                    Moeda moeda;
                    //filtragem da moeda escolhida
                    switch (tipo) {
                        case 1:                        	
                            moeda = new Real(valor, "Real");
                            break;                        
                        case 2:                        	
                            moeda = new Dolar(valor, "Dolar");
                            break;
                        case 3:                        	
                            moeda = new Euro(valor, "Euro");
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                            continue;
                    }
                    //adiciona a moeda no cofrinho
                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada com sucesso.");
                    break;

                case 2:
                	System.out.println("Moedas no cofrinho:");
                    ArrayList<Moeda> moedas = cofrinho.listagemMoedas();
                    //verifica se o cofrinho está vazio
                    if(moedas.isEmpty()) {
                    	System.out.println("Cofrinho Vazio.");
                    	break;
                    }
                    //laço para imprimir os depósitos de moedas
                    for (int i = 0; i < moedas.size(); i++) {
                        Moeda m = moedas.get(i);
                        System.out.println("Depósito n° " + (i+1) + ". " + m.infoNome() + ": " + m.infoValor());
                    }

                    System.out.print("Digite o número do depósito que deseja remover: ");
                    //captura o depósito que deseja remover
                    int indice = scanner.nextInt();
                    //remove o depósito
                    cofrinho.remover(indice-1);
                    System.out.println("Moeda removida com sucesso.");
                    break;

                case 3:
                	System.out.println("Moedas no cofrinho:");              
                    moedas = cofrinho.listagemMoedas();
                    //verifica se o cofrinho está vazio
                    if(moedas.isEmpty()) {
                    	System.out.println("Cofrinho Vazio.");
                    	break;
                    }
                    //laço para imprimir os depósitos de moedas
                    for (int i = 0; i < moedas.size(); i++) {
                        Moeda m = moedas.get(i);
                        System.out.println("Depósito n° " + (i+1) + ". " + m.infoNome() + ": " + m.infoValor());
                    }
                    break;

                case 4:
                	//retorna o valor total convertido em Reais
                	double total = cofrinho.totalConvertido();
                    System.out.printf("Valor total convertido para reais: R$ %.2f %n" , total);
                    break;

                case 0:
                	//encerra o programa
                    System.out.println("Programa encerrado.");
                    break;

                default:
                	//opção padrão caso o usuário digite uma opção errada
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

