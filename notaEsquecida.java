import java.util.Scanner;

public class notaEsquecida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1, nota2, media;

        System.out.printf("Informe a primeira nota:\n");
        nota1 = input.nextInt();
        System.out.printf("Informe a média:\n");
        media = input.nextInt();

        nota2 = 2*media - nota1;
        System.out.println(nota2);
    }
}
