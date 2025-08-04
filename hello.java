public class hello {
    public static void main(String[] args){
        System.out.println("Maven");
        int x = 0;
        while (x<=10) {
            if (x%2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
            x+=1;
        }
    }
}