import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan positif : ");
        a = input.nextInt();

        //factorial tanpa rekursif
        System.out.println("Hasil faktorial tanpa rekursi " + faktor(a));

        //factorial dengan rekursif
        System.out.println("Hasil faktorial dengan rekursi " + faktorial(a));
    }
static int faktor(int a){
    int faktorial = 1;
    for(int i=1; i<=a; i++)
        faktorial = faktorial*i;
        return faktorial;
        }
        static int faktorial(int a){
        int faktor;
        if (a==1)
            faktor=1;
        else
            faktor = a*faktorial(a-1);
        return faktor;
        }
}
