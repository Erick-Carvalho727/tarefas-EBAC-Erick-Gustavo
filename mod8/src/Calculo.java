public class Calculo {

    public static void main(String[] args) {

        System.out.println("A média é: " + realizarCalculo(5, 4, 8, 11));

    }

    private static int realizarCalculo(int num1, int num2, int num3, int num4) {
        int media;
        media = (num1 + num2 + num3 + num4) / 4;
        return media;
    }

}