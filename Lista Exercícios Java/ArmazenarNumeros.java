// 8) Faça um programa que leia um número. Se positivo armazene-o em A, se for 
// negativo, em B. No final mostrar o resultado.
import java.util.Scanner;

public class ArmazenarNumeros {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);

            double A = 0;
            double b = 0;

            while(true) {
                System.out.println(" Digite um núemro (ou 'sair' para encerrar):  ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("Sair")) {
                    break; // sai do loop se digitar sair
                }

                try {
                    double numero = Double.parseDouble(entrada); // convert string em double

                    if (numero > 0){
                        A = numero; // armazena em A se for positivo
                        System.out.print("Número positivo armazenado em A: %.2f \n", A);
                    } else if (numero < 0) {
                        B = numero; // armazena em B se for positivo
                        System.out.print("");
                    }
                }
                

            }
        }

}