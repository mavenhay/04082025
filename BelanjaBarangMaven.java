import java.util.ArrayList;
import java.util.Scanner;

// MAVEN FOR JAVA, MY NAME IS JAVA EXTENSION

public class BelanjaBarangMaven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> barang = new ArrayList<>();
        ArrayList<Double> bayar = new ArrayList<>();
        int totalh = 0;
        int belanja = 1;
        while(belanja==1){
            System.out.println("Nama barang "+ (barang.size()+1) + ":");
            String nama = input.nextLine();
            System.out.println("Harga barang "+ (barang.size()+1) + ":");
            Double harga = input.nextDouble();
            totalh+=harga;
            barang.add(nama);
            bayar.add(harga);
            System.out.println("Total harga saat ini: "+ totalh);
            System.out.println("Ketik 1 untuk lanjut belanja, ketik angka lainnya untuk berhenti:");
            belanja = input.nextInt();
            System.out.println("...");
            String pp = input.nextLine();
        }
        System.out.println("\nBarang yang dibeli:");
        int x = 1;
        while(x<=barang.size()){
            System.out.println(x + ". " + barang.get(x-1)+ " = " + bayar.get(x-1));
            x+=1;
        }
        System.out.println(String.format("""
            ==========================
            Total barang: %d
            Total harga barang: %d
            ==========================
            Terima Kasih!
            """, barang.size(), totalh));
    }
}
