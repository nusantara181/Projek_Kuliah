import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A = 1;
        int B = 1;
        do{
            B = B*A;
            A = A+1;
        }while(A<=n);
        System.out.println(B);
    }
}
