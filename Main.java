import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new
    Scanner(System.in);
    

        System.out.print("Masukkan lama parkir (jam):");
        int jam = input.nextInt();
        int total;

        if (jam== 1){
            total =5000;
        } else {
            total =5000 + (jam - 1)* 3000;
        }
        if (total > 20000) {
            total = 20000;
        }
        System.out.print("Total parkir = Rp" + total);
    }
        }
