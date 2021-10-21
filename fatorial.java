import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma, mult, aux = 0, mq = 0;

        System.out.printf("Informe a soma do fatorial:\n");
        soma = input.nextInt();

        for (int i = soma; i > 0; i-=aux ) {
            mult = 1;

            for (int j = 1; mult <= i; j++) { //descobre qual o maior valor que contribui para a soma
                aux = mult;
                mult *= j;
            }

            mq +=1;

        }

        System.out.println(mq);

    }
}
