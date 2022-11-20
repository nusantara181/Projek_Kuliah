import java.util.Scanner;

public class Looping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = input.nextInt();
        System.out.print("Input B: ");
        int b = input.nextInt();

        for(int i=1; i<=b; i++){
            int c = i*a;
            System.out.print(c + " ");
        }

    }
}
