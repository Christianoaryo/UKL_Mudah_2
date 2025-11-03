import java.util.Scanner;

public class UKL_Mudah_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Bilangan;
        System.out.println("Masukkan Bilangan Bulat : ");
        Bilangan = input.nextDouble();

        if (Bilangan % 2 <=0) {
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
        input.close();
    
    }
}

