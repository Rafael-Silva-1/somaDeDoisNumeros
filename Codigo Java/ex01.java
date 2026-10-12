import java.util.Scanner;

public class ex01{
    public static void main(String[] args){

        int n1, n2, soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, mundo!!");
        System.out.println("Digite dois numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.println("Soma = " + soma);
        sc.close();
    }
}
