import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
                int idade;

                while (true) {
                    System.out.print("NOME");
                    nome = scan.next();
                    if (nome.equals("0")) break;

                    System.out.print("IDADE");
                    idade = scan.nextInt();
                }
                System.out.print("CONTINUE AQUI..");





    }
    }