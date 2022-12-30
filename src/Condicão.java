import java.util.Scanner;

public class Condicão {

    public static void main(String[] args) {

            int x;
            Scanner dado;

            System.out.print("DIGITE UM NUMERO");

            dado = new Scanner(System.in);
            x = dado.nextInt();

            switch (x)
            {
                case 1:
                    System.out.print("NUMERO 1");
                    break;


                case 2:
                    System.out.print("NUMERO 2");
                    break;


                default:
                    System.out.print("OUTRO NUMERO");
            }


        }
    }



