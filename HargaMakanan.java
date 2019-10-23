
import java.util.Scanner;

public class HargaMakanan {
    public static void main(String[] args) {
        String makanan;
        Scanner userInput =new Scanner(System.in);
        double harga = 0;

        System.out.println("Miy ayam");
        System.out.println("Ayam bakar");
        System.out.println("bakso");
        System.out.println("gorengan");

        System.out.print("masukan nama makanan: ");
        makanan = userInput.nextLine();

        switch (makanan){
            case "Miy ayam":
                harga = 10000;
                        break;
            case "Ayam bakar":
                harga = 4000;
                break;
            case " bakso":
                harga = 13000;
                        break;
            case "Gorengan":
                harga = 5000;
                break;
            default:
                System.out.println("Makanan tidak tersedia");
        }
        System.out.println("anda membeli " + makanan+ "dengan harga" +harga);
    }
}
