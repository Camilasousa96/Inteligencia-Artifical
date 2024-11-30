// 1) Faça um programa para calcular o estoque médio de uma peça, sendo que: 
// ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2

import java.util.Scanner;

// criar classe EstoqueMedio
public class EstoqueMedio {
    public static void main(String[] args) {

        // criar objeto scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

       // solicitar quantidade mínima do EstoqueMedio
        System.out.println("Digite sua quantidade mínima: ");
        int quantidadeMinima = scanner.nextInt();
       
        // solicitar quantidade máxima do EstoqueMedio
        System.out.println("Digite sua quantidade máxima: ");
        int quantidadeMaxima = scanner.nextInt();

        // calcular estoque Médio
        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        // exibir o resultado para o usuário
        System.out.println("Seu estoque médio é: " + estoqueMedio);

        scanner.close();
    }
}

