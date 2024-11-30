// 2) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração 
// que sua comissão será de 5% do total da venda e que você tem os seguintes dados: 
// - Identificação do vendedor 
// - Código da peça 
// - Preço unitário da peça 
// - Quantidade vendida

import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // solicitar identificação do usuário
        System.out.print("Identificação do vendedor: ");
        String identificacaoVendedor = scanner.nextLine();

        // solicitar código da peça ao usuário
        System.out.print("Código da peça: ");
        int codigoPeca = scanner.nextInt();

        // solicitar preço unitário da peça ao usuário
        System.out.print("Preço da peça: R$ ");
        double precoPeca = scanner.nextDouble();

        // solicitar quantidade vendida ao usuário
        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        // criar total de venda = preco * quantidade
        double totalVenda = (precoPeca * quantidadeVendida);

        double comissaoVendedores = totalVenda *0.05;

        System.out.println("Identificação do(a) vendedor(a): " + identificacaoVendedor);

        System.out.println("Código da peça: " + codigoPeca);

        System.out.println("Total da venda: R$ " + totalVenda);

        System.out.println("Comissão do vendedor: R$ " + comissaoVendedores);

        scanner.close();

    }
}
