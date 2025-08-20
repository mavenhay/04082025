import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total,diskon=1, pembelian = 0.0, pembayaran = 0.0;

        while (pembelian < 100){
            System.out.println("masukkan harga pembelian:");
            pembelian = input.nextDouble();
            if(pembelian <100) {
                System.out.println("Harga pembelian tidak boleh kurang dari Rp100,00");
            }
        }
        if (pembelian > 500000) {
            System.out.println("dapat diskon 20%");
            diskon = 0.2;
        } else if (pembelian > 300000){
            System.out.println("dapat diskon 15%");
            diskon = 0.15;
        } else if (pembelian > 100000) {
            System.out.println("dapat diskon 10%");
            diskon = 0.1;
        } else {
            System.out.println("tidak dapat diskon");
        }


        total = pembelian*(1-diskon);
        System.out.println("Total pembayaran: "+total);
        while (pembayaran<total) {
            System.out.println("Masukkan pembayaran:");
            pembayaran = input.nextDouble();
            if (pembayaran<total){
                System.out.println("Pembayaran kurang");
            }
        }
        System.out.println("Kembalian: "+ (pembayaran-total));
        System.out.println("Terima kasih sudah berbelanja");
        
    }
}
