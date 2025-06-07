import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }
        double mediaAnual = soma / 12;

        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Meses com temperatura acima da média:");

        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println(i + 1 + meses[i] + temperaturas[i]);
            }
        }

        scanner.close();
    }
}
