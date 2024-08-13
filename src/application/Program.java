package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar?");
        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite o nome do produto:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double preco = sc.nextDouble();
            vetor[i] = new Product(preco, nome);
        }
        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            sum += vetor[i].getPreco();
        }
        double media = sum / n;
        System.out.printf("PREÇO MÉDIO = %.2f%n", media);

        sc.close();
    }
}