import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Price :");
        int price = scan.nextInt();
        int L = price / 20;
        int M = price % 20 / 10;
        int r = (price % 20 % 10 );
        int S=0;

        if (r >= 6 ) {
            M += 1;
        }
        else {
            S = (r + 4) / 5;
        }

        System.out.println("L = "+L);
        System.out.println("M = "+M);
        System.out.println("S = "+S);

        int total = price*58 + L*20 + M*15 + S*10;
        System.out.println("total is "+total+" bath");

    }
}
