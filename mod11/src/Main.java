import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Quantas pessoas você irá cadastrar: ");
        int pessoas = s.nextInt();
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        int genero = 0;
        int contadorM = 0;
        int contadorF = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.print("Digite o nome da " + i + "° da pessoa: ");
            String nome = s.next();

            System.out.print("Digite o sexo do(a) " + nome + " : ");
            String sexo = s.next();

            if (sexo.equalsIgnoreCase("masculino")) {
                masculino.add(sexo);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                feminino.add(sexo);
            } else {
                genero = genero + 1;
            }

        }

        System.out.println("Existem " + masculino.size() + " pessoas do sexo masculino");
        System.out.println("Existem " + feminino.size() + " pessoas do sexo feminino");
        System.out.println("Existem " + genero + " pessoas com sexo diferentes");



    }

}