import java.util.Scanner;

public class Comissões {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[9]; // 9 faixas de salário

        while (true) {
            System.out.print("Digite o valor das vendas brutas (ou -1 para encerrar): ");
            double vendas = scanner.nextDouble();

            if (vendas == -1) break;

            double salario = 200 + vendas * 0.09;
            int indice;

            if (salario >= 1000) {
                indice = 8;
            } else {
                indice = (int)(salario / 100) - 2; // exemplo: 470 → 4.7 → 4 - 2 = 2
            }

            contadores[indice]++;
        }

        // Exibe o resultado
        System.out.println("Distribuição de salários:");
        String[] faixas = {
            "$200 - $299",
            "$300 - $399",
            "$400 - $499",
            "$500 - $599",
            "$600 - $699",
            "$700 - $799",
            "$800 - $899",
            "$900 - $999",
            "$1000 ou mais"
        };

        for (int i = 0; i < contadores.length; i++) {
            System.out.println(faixas[i] + ": " + contadores[i]);
        }

       scanner.close();
    }
}
