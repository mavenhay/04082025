import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        System.out.println("""
                Nama: Maven Helios Agathon Yesstian
                Sekolah asal: SMPN 1 Pacet Mojokerto
                Nama ayah: Wahyu Setianto
                Nama ibu: Aita Yessi Silia
                Cita-cita: Menjadi programmer yang menciptakan inovasi dan penemuan baru
                Hobi: Coding website atau game, bermain video game, jalan-jalan
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Y number: ");
        int y = scanner.nextInt();
        int x = 0;
        double z = 0;
        while (x<=12*y) {
            System.out.print(x);
            System.out.print(" + ");
            System.out.print(y);
            if (x%2 == 0) {
                System.out.println(" = Genap");
            } else {
                System.out.println(" = Ganjil");
            }
            z = Math.round(Math.random());
            x+=y;
            x+=z;
        }
    }
}