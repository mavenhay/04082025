import java.lang.reflect.Array;

public class mavenVariabel {
    public static void main(String[] args) {
        String[] nama = {"Sakti Mahayana Zaman", "Muhammad Jericho Husein", "Muhammad Ilham Daniswara", "Iqbal Ibrahim Widycahyono", "Intazar Lintang Pramanta"};
        int[] umur = {15,15,15,15,16};
        String[] cita = {"Sukses", "Miliarder", "Software engineer", "Pembisnis", "IT Developer"};

        int x = 0;
        while(x<=4) {
            System.out.println("Teman "+ (x+1) + "\nNama: " + nama[x] + "\nUmur: " + umur[x] + "\nCita-cita: " + cita[x] + "\n");
            x+=1;
        }
    }
}