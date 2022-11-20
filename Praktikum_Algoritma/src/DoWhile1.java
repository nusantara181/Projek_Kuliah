import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //Masukkan nilai n
        int A = 1; //Memasukan nilai A

        do{

            System.out.println(A);//mencetak nilai A
            A = A+1;// A increment agar perulangan dapat berhenti

        }while(A<=n);//Mengecek apakah A <= n
    }
}
