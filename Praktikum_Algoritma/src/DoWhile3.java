import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan bulat positif : ");
        int A = input.nextInt();
        int B = 1;

        while (B<=A){
            int C = 1;
            while (C<=B){
                System.out.print("*");
                C=C+1;
            }
            B = B+1;
            System.out.println();
        }
    }
}
