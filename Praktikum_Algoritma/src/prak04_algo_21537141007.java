import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*Nama : Kodrat Nusantara
  NIM  : 21537141007
  Kelas: I.1
  Prodi: Teknologi Informasi
*/
class mahasiswa{
    private String namaMhs;
    private double ipkMhs;
    private int NIMmhs;
    private mahasiswa key;
    public mahasiswa(String nama, double ipk, int nim){ //constructor
        namaMhs = nama;
        ipkMhs = ipk;
        NIMmhs = nim;
    }
    //Method untuk menampilkan data mahasiswa
    public void tampilMahasiswa(){
        System.out.println(namaMhs + "---" + ipkMhs + "---" + NIMmhs);
    }
    //method untuk menampilkan data mahasiswa yang di sorting berdasarkan nim
    public void sortingnim(){out.println(NIMmhs+"---"+namaMhs+"---"+ipkMhs);}
    //method untuk menampilkan data mahasiswa yang di sorting berdasarkan nama
    public void sortingnama(){out.println(namaMhs+"---"+NIMmhs+"---"+ipkMhs);}
    //Method untuk mengambil data nama mahasiswa
    public String getNama() {
        return namaMhs;
    }
    //Method untuk mengambil data ipk mahasiswa
    public double getIpkMhs(){
        return ipkMhs;
    }
    //Method untuk mengambil data NIM mahasiswa
    public int getNIMmhs(){
        return NIMmhs;
    }
    //Method untuk mengupdate nama mahasiswa
    void setNamaMhs(String namaMhs){
        this.namaMhs = namaMhs;
    }
    //Method untuk mengupdate IPK mahasiswa
    void setIpkMhs(double ipkMhs){
    this.ipkMhs = ipkMhs;
    }
    //Method untuk mengupdate NIM mahasiswa
    void setNIMmhs(int NIMmhs){
        this.NIMmhs = NIMmhs;
    }
}
class dataArray {
    private mahasiswa[] data;
    private int nData;
    private mahasiswa temp;
    private Scanner input = new Scanner(System.in);
    public dataArray(int max) {//Constructor
        data = new mahasiswa[max];
        nData = 0;
    }
    //mengakses nData atau jumlah data
    public int Jumlah_Data(){//mengembalikan jumlah data array
        return nData;
    }

    //Method memasukkan data
    public void input(String nama, double ipk, int nim) {
        data[nData] = new mahasiswa(nama, ipk, nim);
        nData++;
    }

    //Method menampilkan data
    public void tampilArray() {
        System.out.println("Nama------IPK------NIM");
        System.out.println("----------------------");
        for (int i = 0; i < nData; i++)
            data[i].tampilMahasiswa();
        System.out.println(" ");
    }
    public void lihat(int jml) {
        if (jml < nData) {
            System.out.print("  " + (jml + 1) + "     ");
            System.out.print(data[jml].getNIMmhs() + "    ");
            System.out.print(data[jml].getNama() + "    ");
            out.println(data[jml].getIpkMhs());
            lihat(++jml);
        }
    }
    public void tampilsortingnama() { //metode untuk menampilkan data sorting mahasiswa berdasarkan nama
        System.out.println("Nama------NIM------IPK");
        System.out.println("----------------------");
        for(int i=0; i<nData; i++)
            data[i].sortingnama();
        System.out.println("");
    }
    public void tampilsortingnim() { //metode untuk menampilkan data sorting mahasiswa berdasarkan nim
        System.out.println("NIM------Nama------IPK");
        System.out.println("----------------------");
        for(int i=0; i<nData; i++)
            data[i].sortingnim();
        System.out.println("");
    }

    //Method mencari data
    public mahasiswa cari(String cariData) {
        int i;
        for (i = 0; i < nData; i++)
            if (data[i].getNama().equals(cariData))
                break;
        if (i == nData)
            return null;
        else
            return data[i];
    }
    //method menghapus data
    public boolean hapus(String cariData) {
        int i;
        for (i = 0; i < nData; i++)
            if (data[i].getNama().equals(cariData))
                break;
        if (i == nData)
            return false;
        else {
            for (int j = i; j < nData; j++)
                data[j] = data[j + 1];
            nData--;
            return true;
        }
    }
    //Method mengurutkan data
    public boolean SortingData() {
        byte menu;
        do {
            out.println("Menu Sorting Data Secara Descending");
            out.println("1. Sorting Berdasarkan Nama dengan insertion sort");
            out.println("2. Sorting Berdasarkan NIM dengan insertion sort");
            out.println("3. Sorting Berdasarkan NIM dengan shellsort");
            out.println("4. Sorting Berdasarkan NIM dengan quicksort");
            out.println("5. Keluar Menu Sorting");
            out.print("Pilih menu sorting: ");
            menu = input.nextByte();
            switch (menu){
                case 1: {
                    int p =0;
                    while(p<nData){
                        for (int i = 1; i < nData; i++) {
                            temp = data[i];
                            String nama = data[i].getNama();
                            int j = i-1;
                            String nama2 = data[j].getNama();
                            while ((j>=0) && (nama.compareTo(nama2)<0)) {//membandingkan nama mahasiswa
                                data[j+1] = data[j];
                                j--;
                            }data[j+1] = temp;
                        }p++;
                    }tampilsortingnama();
                    break;
                }
                case 2: {
                    int p = 0;
                    while(p<nData) {
                        for (int i = 1; i < nData; i++) {
                            temp = data[i];
                            int key = data[i].getNIMmhs();//mengambil nim mahasiswa
                            int j = i - 1;
                            int key2 = data[j].getNIMmhs();
                            while ((j >= 0) && (key2 < key)) {
                                data[j+1] = data[j];
                                j--;
                            }data[j+1] = temp;
                        }p++;
                    }tampilsortingnim();
                    break;
                }
                case 3:{
                    int lompat = nData;
                    while (lompat > 1) {
                        boolean tukar=true;
                        lompat = lompat / 2;
                        int i = nData - lompat;
                        while (tukar==true) {
                            tukar = false;
                            for (int j = 0; j < i; j++) {
                                if (data[j].getNIMmhs() < data[j + lompat].getNIMmhs()) {
                                    temp = data[j];
                                    data[j] = data[j + lompat];
                                    data[j + lompat] = temp;
                                    tukar = true;
                                }
                            }
                        }
                    }tampilsortingnim();
                    break;
                }
                case 4:{
                    quicksort();
                    tampilsortingnim();
                }
            }
        }while(menu!=5);
        return true;
    }
    //Method untuk quicksort
    public void quicksort() {
        quicksortNIM(data, 0, nData - 1);
    }
    //method quicksort dengan nim
    private void quicksortNIM(mahasiswa[] data, int start, int end) {
        if (start < end) {
            int nim = quicknim(data, start, end);
            quicksortNIM(data, start, nim - 1);
            quicksortNIM(data, nim + 1, end);
        }
    }
    //method menukar data
    private void swap(mahasiswa[] data, int i, int j) {
        mahasiswa temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    //method untuk quicksort
    private int quicknim(mahasiswa[] data, int start, int end) {
        mahasiswa temp = data[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (data[j].getNIMmhs() > temp.getNIMmhs()) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i+1, end);
        return (i+1);
    }
    //Method edit data
    public boolean edit(String cariData) {
        Byte menu;
        mahasiswa temukan = cari(cariData);
        do {
            out.println("Menu Update Data");
            out.println("1. Update Data Nama          -> " + temukan.getNama());   //menampilkan data nama yang akan diupdate
            out.println("2. Update Data Ipk           -> " + temukan.getIpkMhs());    //menampilkan data ipk yang akan diupdate
            out.println("3. Update Data NIM          -> " + temukan.getNIMmhs()); //menampilkan data NIM yang akan diupdate
            out.println("4. Kembali Ke Menu Awal");
            out.print("Pilih data yang akan diedit : ");
            menu = input.nextByte();
            switch (menu) {
                case 1:
                    out.print("Masukkan nama mahasiswa : ");
                    input.nextLine();
                    String namaMhs = input.nextLine();
                    temukan.setNamaMhs(namaMhs);
                    out.println("Nama mahasiswa telah di update --> " + temukan.getNama()); //menampilkan data nama terbaru
                    break;
                case 2:
                    out.print("Masukkan IPK baru mahasiswa : ");
                    double ipkMhs = input.nextDouble();
                    temukan.setIpkMhs(ipkMhs);
                    out.println("IPK mahasiswa telah di update --> " + temukan.getIpkMhs());//menampilkan data ipk terbaru
                    break;
                case 3:
                    out.print("Masukkan NIM baru mahasiswa : ");
                    int nimMhs = input.nextInt();
                    temukan.setNIMmhs(nimMhs);
                    out.println("NIM mahasiswa telah diperbarui --> " + temukan.getNIMmhs());//menampilkan data nim terbaru
                    break;
            }
        } while (menu > 0 && menu < 4);
        return true;
    }
    //binary search untuk mencari nama
    public mahasiswa binarysearchNama(String cariNama) {
        int l = 0, r = nData-1, m = -1;
        boolean ketemu = false;

        while(l <= r && !ketemu) {
            m = (l + r) / 2;
            if(data[m].getNama().equals(cariNama)) {//membandingkan data nama pada indeks ke-m dengan pencarian
                ketemu = true;
            } else if(data[m].getNama().compareTo(cariNama) > 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if(ketemu) {
            System.out.println("Data ditemukan");
            data[m].tampilMahasiswa();
            System.out.println();
        } else {
            System.out.println("Data tidak ditemukan \n");
        }
        return null;
    }
    //binary search untuk mencari nim
    public void binarySearchNim(int carinim) {
        int l = 0, r = nData-1, m = -1;
        boolean ketemu = false;

            while(l <= r && !ketemu) {
                m = (l + r) / 2;
                if(data[m].getNIMmhs() == carinim) {//membandingkan data nim dengan nim yang dicari
                    ketemu = true;
                } else if(data[m].getNIMmhs() > carinim) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            if(ketemu) {
                System.out.println("Data ditemukan");
                data[m].tampilMahasiswa();
                System.out.println();
            } else {
                System.out.println("Data tidak ditemukan \n");
            }

        }
    public boolean BinarySearch() {
        byte menu;
        do {
            System.out.println("--------------------------------------");
            System.out.println("          MENU BINARY SEARCH          ");
            System.out.println("--------------------------------------");
            System.out.println("1.\tCari berdasarkan Nama");
            System.out.println("2.\tCari berdasarkan NIM ");
            System.out.println("3.\tKeluar ");
            System.out.println("--------------------------------------");
            System.out.print("Pilih Menu Search > ");
            menu = input.nextByte();

            System.out.println();
            switch(menu) {

                case 1:
                    System.out.println("Nama yang ingin dicari: ");
                    String cariNama = input.next();
                    binarysearchNama(cariNama);
                    break;
                case 2:
                    System.out.println("NIM yang ingin dicari: ");
                    int cariNIM = input.nextInt();
                    binarySearchNim(cariNIM);
                case 3:
                    out.println();
                    break;
                default:
                    System.out.println("Pilih menu 1-3 !!!");
            }
        }while(menu !=3);
        return true;
    }
}//end class dataArray
////////////////////////////////////////////////////////////////
public class prak04_algo_21537141007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Data, menu, max = 100;
        Byte nElemen;
        dataArray arr = new dataArray(max);

        do {
            out.println(" ");
            out.println("Pilih Menu di bawah ini");
            out.println("1.\tMemasukkan data");
            out.println("2.\tPencarian data");
            out.println("3.\tPenghapusan data");
            out.println("4.\tMenampilkan data");
            out.println("5.\tEdit data");
            out.println("6.\tSorting data mahasiswa");
            out.println("7.\tPencarian data dengan binary search");
            out.println("8.\tKeluar");
            out.print("Pilih Menu: ");
            menu = input.nextInt();
            out.println();

            switch (menu) {
                case 1: {
                    out.print("Masukkan jumlah data = ");
                    nElemen = input.nextByte();
                    out.println();
                    for (int i = 1; i <= nElemen; i++) {
                        out.print("Masukkan nama mahasiswa = ");
                        String nama = input.next();
                        out.print("Masukkan IP mahasiswa = ");
                        double ip = input.nextDouble();
                        out.print("Masukkan NIM Mahasiswa = ");
                        int nim = input.nextInt();
                        arr.input(nama, ip, nim);
                        arr.tampilArray();
                    }
                }
                break;
                case 2: {
                    out.print("Nama yang dicari = ");
                    String cariData = input.next();
                    out.println();
                    mahasiswa ketemu = arr.cari(cariData);
                    if (ketemu != null) {
                        out.println("Data " + ketemu.getNama() + " ditemukan ");
                        ketemu.tampilMahasiswa();
                    } else
                        out.println("Data " + cariData + " tidak ditemukan");
                }
                break;
                case 3: {
                    Data = arr.Jumlah_Data();
                    if (Data == 0) {
                        out.println("TIDAK ADA DATA YANG BISA DIHAPUS");
                        out.println("--Masukkan Data Terlebih Dahulu--");
                    } else {
                        System.out.print("Nama yang mau dihapus = ");
                        String hapusNama = input.next();
                        arr.hapus(hapusNama);
                        out.println("Data " + hapusNama + " berhasil dihapus");
                    }
                }
                break;
                case 4: {
                    Data = arr.Jumlah_Data();
                    if (Data == 0) {
                        out.println("TIDAK ADA DATA YANG BISA DITAMPILKAN");
                        out.println("---Masukkan Data Terlebih Dahulu---");
                    } else {
                        out.println("DATA MAHASISWA SAAT INI");
                        arr.tampilArray();
                        out.println("DATA MAHASISWA SAAT INI(Rekursif)");
                        arr.lihat(0);
                    }
                }
                break;
                case 5: {
                    input.nextLine();
                    out.print("Data yang akan di edit : ");
                    String Ndata = input.nextLine();
                    mahasiswa temukan = arr.cari(Ndata);
                    if (temukan == null) {
                        out.println("Data " + Ndata + "tidak ditemukan");
                        out.println("Data mahasiswa terbaru");
                        arr.tampilArray();
                    } else {
                        arr.edit(Ndata);
                    }
                }
                break;
                case 6: {
                    Data = arr.Jumlah_Data();
                    if (Data == 0) {
                        out.println("TIDAK ADA DATA YANG BISA DITAMPILKAN");
                        out.println("---Masukkan Data Terlebih Dahulu---");
                    } else {
                        input.nextLine();
                        arr.SortingData();
                    }
                    break;
                }
                case 7:{
                    arr.BinarySearch();
                }
            }
        } while (menu > 0 && menu < 8);
        out.println();
        out.println("T E R I M A  K A S I H");
        out.println();
        }
}