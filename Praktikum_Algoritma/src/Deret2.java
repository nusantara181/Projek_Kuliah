import java.util.Scanner;

public class Deret2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int n = input.nextInt();
        int a = 1;
        int b = 1;
        int sum = 0;
        while(b<=n){
            int c = b-1;
            a = a+c;
            sum = sum + a;
            b++;
        }
        System.out.println(sum);
    }
}
