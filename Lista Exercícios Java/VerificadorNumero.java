// 10)Escreva um programa que leia dois números inteiros e apresente as opções para 
// usuário escolher o que deseja realizar: 
// 1 – Verificar se um dos números lidos é ou não múltiplo do outro 
// 2 – Verificar se os dois números lidos são pares 
// 3 – Verificar se a média dos dois números é maior ou igual a 7. 
// 4 – Sair
import java.util.Scanner;
s
public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int opcao;

        do {
            System.out.println("\n Escolha uma opção: ");
            System.out.println("1- Verificar se um dos números lidos é ou não múltiplo do outro ");
            System.out.println("2- Verificar se os dois números lidos são pares ");
            System.out.println("3- Verificar se a média dos dois números é maior ou igual a 7");
            System.out.println("4- Sair");
            System.out.println("Opção escolhida: ");
            opcao = scanner.nextInt()
;

switch (opcao) {
    case 1:
    verificarMultiplo (numero1, numero2);
    break;
;}
        }



}
