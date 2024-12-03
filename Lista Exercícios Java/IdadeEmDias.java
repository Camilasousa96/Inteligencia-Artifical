// 4) Faça um algoritmo que leia a idade de uma pessoa expressa em dias, meses e 
// anos e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano 
// com 365 dias e mês com 30 dias.
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        int totalDias= (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade total em dias é: " +totalDias);

        scanner.close();
    }
} 
