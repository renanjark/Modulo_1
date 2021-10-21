import java.util.Scanner;

public class teleferico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, a, n = 0;

        System.out.printf("Informe a capacidade da cabine:\n");
        c = entrada.nextInt();
        System.out.printf("Informe o número total de alunos:\n");
        a = entrada.nextInt();

        for (int i = a; i > 0; i-=(c-1)) {
            n+=1;
        }

        System.out.println(n);

    }
}
