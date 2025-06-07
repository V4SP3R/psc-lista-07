
import java.util.ArrayList;
import java.util.Scanner;

public class Notas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota, soma = 0;
        
        while (true) { 
            System.out.println("Digite uma nota (-1 para finalizar)");
            nota = scanner.nextDouble();
            if(nota == -1) 
            break;
            notas.add(nota);
            soma+=nota;
        }
        int total = notas.size();
        System.out.println("Quantiade de notas: " + total);
        
        System.out.print("Notas: ");
        for(double n : notas){
            System.out.print(n + " ");
        }
        System.out.println("Notas em ordem inversa: ");
        for (int i = total - 1; i <=0; i--){
            System.out.println(notas.get(i));           
        }
        double media = soma / total;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        int acimaMedia = 0;
        int abaixoSete = 0;

        for (double n : notas) {
            if (n > media) acimaMedia++;
            if (n < 7) abaixoSete++;
        }
        
        System.out.println("Acima da média: " + acimaMedia);
        System.out.println("Abaixo de 7: " + abaixoSete);
        System.out.println("\nPrograma finalizado.");

        scanner.close();
    }
}