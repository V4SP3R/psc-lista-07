import java.util.Scanner;

public class Perguntas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        int respostas = 0;
        System.out.println("Respondas as perguntas com 'S' para sim ou 'N' para Não. \n");
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine().trim().toLowerCase();

            if(resposta.equals("S")){
                respostas++;
            }
        }
        String classicação;

        System.out.println("Classificação");
        if (respostas ==2) {
            classicação = "Suspeita";
 
        } else if(respostas>=3 && respostas <=4){
            classicação = "Cumplice";
        } else if(respostas==5){
            classicação = "Assasino";
        }else{
            classicação = "Inocente";
        }
        System.out.println("Resultado: " + classicação);
        scanner.close();
    }
}