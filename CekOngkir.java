import java.util.Scanner;

public class CekOngkir {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Total belanja: ");
        double totalBelanja = input.nextDouble();

        System.out.print("Member? (true/false): ");
        boolean isMember = input.nextBoolean();

        if (totalBelanja >= 100000 || isMember) {
            System.out.println("Gratis ongkir");
        } else {
            System.out.println("Bayar ongkir");
        }
    }
}