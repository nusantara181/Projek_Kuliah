import java.util.Scanner;

public class prak02_algo_21537141007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan bulat positif : ");
        int A = input.nextInt();
        int B = 1;

        while (B <= A){
            int C = 1;
            while (C<=A){
                System.out.print("*");
                C++;
            }
            System.out.println();
            A--;
        }
    }
}