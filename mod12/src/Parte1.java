import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parte1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome = null;
        System.out.print("Digite o nome das pessoas separado por vírgula: ");
        nome = s.next();
        String[] pessoas = nome.split(",");

        Arrays.sort(pessoas);

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }

    }

}