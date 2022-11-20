public class Ujicoba {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while ( (j >= 0) && ( array [j] < key ) ) {
                array [j+1] = array [j];
                j--;
            }array[j+1] = key;
        }
    }
public static void binarysort(int array[]){
        int n = array.length;
        for(int i = 2; i < n; i++){
           int x = array[i];
           int l = 1;
           int r = i-1;
           while (l<=r){
               int m = (l+r)/2;
               if(x < array[m]) {
                   r = m - 1;
               }l = m+1;
           }for(int j = i-1; j>l; j--){
               array[j+1] = array[j];
            }array[l] = x;
        }
}
    public static void Shellsort(int array[]) {
        int lompat = array.length;
        while (lompat > 1) {
            boolean tukar=true;
            lompat = lompat / 2;
            int i = array.length - lompat;
            while (tukar==true) {
                tukar = false;
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + lompat]) {
                        int temp = array[j];
                        array[j] = array[j + lompat];
                        array[j + lompat] = temp;
                        tukar = true;
                    }
                }
            }
        }
    }
    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println();
        binarysort(arr1);
        for (int i = 0; i < arr1.length; ++i){
            System.out.print(arr1[i] + " ");
        System.out.println();
        }
    }
}