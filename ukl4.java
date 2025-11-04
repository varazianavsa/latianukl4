import java.util.Scanner;

public class ukl4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jari jari tabung ");
        int r = input.nextInt();
        System.out.println("masukan tinggi tabung");
        int t = input.nextInt();

        double phi = 22 / 7;
        double volume = (phi) * r * r * t;
        System.out.println("volume tabung adlah : " + volume);
    }
}
