import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        int sayi=scanner.nextInt();
        int toplam=0;
        do{
            toplam+=sayi%10;
            sayi/=10;

        }while(sayi>0);
        System.out.println("Rakamları toplamı:"+toplam);
    }

}