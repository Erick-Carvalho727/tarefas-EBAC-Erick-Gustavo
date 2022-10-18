import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int notaFinal;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        String nome = null;

        System.out.print("Digite o nome do aluno: ");
        nome = s.next();

        List<Integer> notas = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {

            System.out.print("Digite a " + i + "° nota: ");
            notas.add(s.nextInt());

        }

        notaFinal = (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3))/ 4;

        if (notaFinal >= 7) {
            System.out.println("Aluno " + nome + " aprovado!!");
        } else if (notaFinal >= 5) {
            System.out.println("Aluno " + nome + " de recuperação!!");
        } else {
            System.out.println("Aluno " + nome + " reprovado!!");
        }

    }

}