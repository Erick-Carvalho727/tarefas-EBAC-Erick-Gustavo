import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome = null;
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        System.out.print("Digite o nome das pessoas separado por vírgula e do lado do nome um traço com F de feminino ou M de masculino: ");
        nome = s.nextLine();
        String[] pessoas = nome.split(",");


        String[] mulher;
        String[] homem;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].contains("-f")) {
                mulher = pessoas[i].split("-f");
                for (int j = 0; j < mulher.length; j++) {
                    feminino.add(mulher[j]);
                }
            } else if (pessoas[i].contains("-m")) {
               homem = pessoas[i].split("-m");
                for (int j = 0; j < homem.length; j++) {
                    masculino.add(homem[j]);
                }
            }
        }

        System.out.println("Mulheres dessa lista: " + feminino);
        System.out.println("Homens dessa lista: " + masculino);

    }
}
